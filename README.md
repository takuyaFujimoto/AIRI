# AIRI
### 作成中
起動メモ(api)
1. gradleでbuildしてプロジェクトのjarファイルを作成
2. dockerディレクトリに移動して `docker-compose build`(初回時)
3. `docker-compose up`で起動
4. localhost:8080にリクエスト投げて起動確認(get, post, put, delete)

起動メモ(front)
1. frontのディレクトリに移動して `yarn install`(初回時)
2. `yarn run serve`で起動
3. localhost:3000にアクセスして起動確認(Vueのページが見れる)
