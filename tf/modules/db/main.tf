resource heroku_addon prevengic-api-db {
  app = var.app_prevengic_api
  plan = "heroku-postgresql:hobby-dev"
}