### **Overall 4-Week Strategy**

- **Week 1: The Foundations & Request Lifecycle.** We will learn the fundamental components of a system and connect them to how browsers and servers communicate, a concept familiar in front-end development.
- **Week 2: The World of Data.** This week focuses deeply on Chapter II (Databases). This is the GOLDEN opportunity to directly link the data structures you're learning (Linked Lists, Trees, Hash Tables) to how databases work internally (Indexes, Sharding).
- **Week 3: Architecture & Communication.** We'll concentrate on Chapter III, connecting architectural patterns (Microservices) to the Graph data structure, and communication patterns (Event-Driven) to your knowledge of the NodeJS Event Loop.
- **Week 4: Operations & Practice.** This week is about operational concerns (Chapter IV) and applying all your acquired knowledge to real-world interview problems (Chapter V).

---

### **Detailed Weekly Plan**

#### **WEEK 1: THE FOUNDATIONS & REQUEST LIFECYCLE**

**Goal:** Complete "Getting Started" and Chapter I of the repo. Build a foundational mindset of a complete system.

- **Monday:**

  - **System Design (1h):**
    1.  Getting Started: [What is system design?](https://github.com/karanpratapsingh/system-design/blob/main/getting-started/what-is-system-design.md)
    2.  Chapter I: [DNS](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/dns.md)
  - **Synergy:**
    - **FE Fundamentals:** When you learn about `fetch()` or `async/await` in JS, you're initiating a request. DNS is the invisible first step of that process.
    - **DSA (Udemy - Recursion):** While there's no direct link, understanding the Call Stack in recursion helps you visualize the "layers" of processing in a system.

- **Tuesday:**

  - **System Design (1h):**
    1.  Chapter I: [Load Balancing](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/load-balancing.md)
    2.  Chapter I: [Clustering](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/clustering.md)
  - **Synergy:**
    - **FE Fundamentals:** A Load Balancer is why APIs from major companies like Google and Facebook never seem to go down. It distributes millions of requests from front-end users.
    - **DSA (Udemy - Sorting Algorithms):** Understanding algorithmic efficiency helps you appreciate different load-balancing strategies (e.g., Round Robin vs. Least Connections).

- **Wednesday:**

  - **System Design (1h):**
    1.  Chapter I: [Caching](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/caching.md)
    2.  Chapter I: [Content Delivery Network (CDN)](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/cdn.md)
  - **Synergy:**
    - **FE Fundamentals:** A CDN is what makes your static files (images, CSS, JS bundles) load quickly for users worldwide. Caching is also a critical performance optimization technique on both the client (browser cache) and server.
    - **NodeJS:** Learning the Event Loop helps you understand why reducing I/O (reading from a cache instead of a database) is so impactful.

- **Thursday:**

  - **System Design (1h):**
    1.  Chapter I: [Proxy](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/proxy.md)
    2.  Chapter I: [Availability](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/availability.md)
  - **Synergy:**
    - **Cracking the Coding Interview (Big O):** The concept of "Availability" (e.g., 99.99% uptime) is a form of system performance metric, just as Big O is an algorithmic performance metric.

- **Friday:**
  - **System Design (1h):**
    1.  Chapter I: [Scalability](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/scalability.md)
    2.  Chapter I: [Storage](https://github.com/karanpratapsingh/system-design/blob/main/chapter-i/storage.md)
  - **Synergy:**
    - **DSA (Udemy - Merge/Quick Sort):** Efficient algorithms are the foundation of scalability at the code level. A system cannot scale if the code itself is slow.

---

#### **WEEK 2: THE WORLD OF DATA**

**Goal:** Complete Chapter II. This is the week with the strongest synergy with DSA.

- **Monday:**

  - **System Design (1h):**
    1.  Chapter II: [Databases and DBMS](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/databases-and-dbms.md)
    2.  Chapter II: [SQL vs NoSQL databases](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/sql-vs-nosql-databases.md)
  - **Synergy:**
    - **DSA (Udemy - Linked Lists):** Understanding data structures is the first step to understanding how data is organized within a database.

- **Tuesday:**

  - **System Design (1h):**
    1.  Chapter II: [Database Replication](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/database-replication.md)
    2.  Chapter II: [Indexes](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/indexes.md)
  - **Synergy:**
    - **DSA (Udemy - Binary Search Trees):** **DIRECT LINK!** Database indexes are often implemented using B-Trees, a variation of Binary Search Trees. Understanding BSTs helps you understand _why_ an index makes queries exponentially faster.

- **Wednesday:**

  - **System Design (1h):**
    1.  Chapter II: [ACID and BASE consistency models](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/acid-and-base-consistency-models.md)
    2.  Chapter II: [CAP theorem](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/cap-theorem.md)
  - **Synergy:**
    - **React:** When you manage state in React, you are dealing with "consistency" at a micro-level. Understanding ACID/BASE gives you the right mindset for data integrity.

- **Thursday:**

  - **System Design (1h):**
    1.  Chapter II: [Transactions](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/transactions.md)
    2.  Chapter II: [Distributed Transactions](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/distributed-transactions.md)
  - **Synergy:**
    - **Cracking the Coding Interview (Problem Solving):** The concept of a transaction ("all or nothing") is a crucial thinking pattern for solving many complex algorithm problems.

- **Friday:**
  - **System Design (1h):**
    1.  Chapter II: [Sharding](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/sharding.md)
    2.  Chapter II: [Consistent Hashing](https://github.com/karanpratapsingh/system-design/blob/main/chapter-ii/consistent-hashing.md)
  - **Synergy:**
    - **DSA (Udemy - Hash Tables):** **DIRECT LINK!** Consistent Hashing is an advanced and critical application of Hash Tables. You will see your DSA knowledge being applied to a massive, real-world problem.

_(This strategic approach will continue for Weeks 3 & 4)_

---

#### **WEEK 3: ARCHITECTURE & COMMUNICATION**

**Goal:** Complete Chapter III. Link system architectures to your knowledge of NodeJS and FE.

- **Monday:** `N-tier architecture`, `Message Brokers`, `Message Queues`. **Synergy:** The Queue data structure.
- **Tuesday:** `Monoliths and Microservices`. **Synergy:** The Graph data structure (a microservice architecture is a graph of services).
- **Wednesday:** `Event-Driven Architecture (EDA)`. **Synergy:** The NodeJS Event Loop. This is the "heart" of NodeJS.
- **Thursday:** `API Gateway`, `REST`, `GraphQL`, `gRPC`. **Synergy:** This is the daily work of a front-end engineer. Understanding API Gateways helps you understand the "front door" your FE app communicates with.
- **Friday:** `Long polling`, `WebSockets`, `Server-Sent Events`. **Synergy:** These are the FE technologies for building real-time applications (chat, notifications, dashboards).

---

#### **WEEK 4: OPERATIONS & PRACTICE**

**Goal:** Complete Chapters IV & V. Apply all learned concepts to specific problems.

- **Monday:** `Rate Limiting`, `Circuit breaker`. **Synergy:** Techniques to ensure a stable system and prevent overload from clients.
- **Tuesday:** `Virtual Machines (VMs) and Containers`. **Synergy:** The environments where you deploy your NodeJS/React applications.
- **Wednesday:** `OAuth 2.0`, `Single Sign-On (SSO)`. **Synergy:** The authentication flows you often implement on the front-end (e.g., Login with Google/Facebook).
- **Thursday:** Begin Chapter V: **[URL Shortener](https://github.com/karanpratapsingh/system-design/blob/main/chapter-v/url-shortener.md)**. **Synergy:** Synthesizes all your knowledge: Hashing, Databases, Load Balancing, Caching.
- **Friday:** Chapter V: **[WhatsApp](https://github.com/karanpratapsingh/system-design/blob/main/chapter-v/whatsapp.md)**. **Synergy:** Synthesizes your knowledge of WebSockets, Databases, and Message Queues.

This way, you aren't just learning System Design in isolation. You are building a **network of knowledge**, where every new concept reinforces and clarifies what you've learned in other areas. Happy studying
