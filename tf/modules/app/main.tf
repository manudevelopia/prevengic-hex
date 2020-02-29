resource heroku_app prevengic-api {
  name = var.app_prevengic_api
  region = var.region

  config_vars = {
    APP_ENV = var.environment
  }

  buildpacks = ["heroku/gradle"]
}