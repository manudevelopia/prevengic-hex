provider heroku {
  email = var.heroku_account_email
  api_key = var.heroku_api_key
}

module modules {
  source = "./modules"
  environment = var.environment
  region = var.region
  app_prevengic_api = var.app_prevengic_api
}