class UrlMappings {

	static mappings = {

        name greetingModule: "/greetings/${name}"(controller: "greetings") { action = [GET: "hello"]}

        name companyModule: "/companies"(controller: "company") {
            action = [GET: "list", POST: "create"]
        }

        name companyModule: "/companies/${id}"(controller: "company") {
            action = [DELETE: "delete", PUT: "update", GET: "show"]
        }

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
