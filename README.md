# points-sorter

This project demonstrates DDD principles for building applications.
Application consists of layers: Domain, Application, Infrastructure. Each layer is part of some other layer; that makes it looks like an onion, and this architecture sometimes called as Onion Architecture. Application communicates with external services using ports which provide interfaces for communicating with the application.
This architecture makes it easier to test different layers, also gives opportunities to add/modify communication with the application not changing domain layer with business logic inside.

Onion architecture (DDD):
![Onion architecture picture](https://dzone.com/storage/temp/4436217-kolka.png)

Video that describes DDD principles(PL): https://www.youtube.com/watch?v=yhYFL4ujYqY&t=1s
