import { getUsers } from '../../plugins/api'
// ミスった・・性別英語やん・・
const GENDER = {
  male: '女性',
  female: '男性',
  not_applicable: '中性'
}
const state = {
  headers: [],
  items: [],
  info: {
    page: 1,
    rowsPerPage: 5,
    sortBy: 'id',
    descending: false
  }
}

// getXXで統一
const getters = {
  getPagination: state => state.info
}

// actionsを必ず経由してcommitするようにする
const actions = {
  updatePageNation ({ commit }, payload) {
    commit('setPagination', payload)
  },
  async callGetUsersApi ({ commit }) {
    commit('app/setIsFatch', true, { root: true })
    const { result } = await getUsers()

    // とりあえずベタ書き
    commit(
      'setheaders',
      [
        { text: '氏名', value: 'name' },
        { text: 'フリガナ', value: 'phonetic' },
        { text: '性別', value: 'gender' },
        { text: 'メール', value: 'email' },
        { text: '年齢', value: 'age' },
        { text: '出身地', value: 'from' },
        { text: '入社日', value: 'hireDate' },
        { text: '役職', value: 'rool' },
        { text: '電話番号', value: 'tel' }
      ]
    )
    const items = []
    result.forEach((x) => {
      const hash = {}
      hash.userId = x.user_id
      hash.name = `${x.first_name} ${x.last_name}`
      hash.phonetic = `${x.first_phonetic} ${x.last_phonetic}`
      hash.gender = GENDER[x.gender]
      hash.email = x.email
      hash.age = x.age
      hash.from = x.from
      hash.hireDate = x.hire_date
      hash.rool = x.rool
      hash.tel = x.tel
      items.push(hash)
    })
    commit('setitems', items)
    commit('app/setIsFatch', false, { root: true })
  }
}

// setXXで統一
const mutations = {
  setPagination (state, payload) {
    state.info = payload
  },
  setheaders (state, payload) {
    state.headers = payload
  },
  setitems (state, payload) {
    state.items = payload
  }
}

export default { namespaced: true, state, getters, actions, mutations }
