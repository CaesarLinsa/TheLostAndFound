# TheLostAndFound
## 安装部署
### 前端
前端使用yarn进行包管理
1. 安装nodejs, 并配置环境变量
2. 执行 npm install yarn -g （全局安装yarn)
3. 进入front 目录中，执行 `yarn install`, 安装依赖包
4. 启动服务 `yarn run dev`

### 后端    
后端使用maven进行包管理    
1. 项目下，执行`maven compile`(linux), `mvn compile`(windows) 安装依赖包    
2. 执行后端入口 TheLostAndFoundApplication.java 中main方法启动    
如果启动出现数据库问题，请注意检查数据库root密码123是否与您的一致
