module app {
  source = "./app"
  environment = var.environment
  region = var.region
  app_prevengic_api = var.app_prevengic_api
}

module db {
  source = "./db"
  environment = var.environment
  region = var.region
  app_prevengic_api = var.app_prevengic_api
}