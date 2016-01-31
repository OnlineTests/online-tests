USE `online_tests`;

INSERT INTO `User`(username, password, name, age, email, gender) VALUES('Arnold', '12345', 'Szederjesi Arnold', 22, 'szederjesiarnold@yahoo.com', 'M')
INSERT INTO `User`(username, password, name, age, email, gender) VALUES('Andra', '12345', 'Dragomir Andra', 23, 'green@yahoo.com', 'F')
INSERT INTO `User`(username, password, name, age, email, gender) VALUES('Paula', '12345', 'Oprea Paula', 22, 'paula_oprea08@yahoo.com', 'F')

INSERT INTO `Category`(name) VALUES('istorie')
INSERT INTO `Category`(name) VALUES('geografie')
INSERT INTO `Category`(name) VALUES('muzica')
INSERT INTO `Category`(name) VALUES('pictura')
INSERT INTO `Category`(name) VALUES('literatura')
INSERT INTO `Category`(name) VALUES('filme')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'In ce an a avut loc Revoluția Română?', '1984', '1981', '1989', '1983', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Intre ce ani a domnit Regele Carol I al României?', '1886 – 1908', '1896 – 1910', '1886 – 1900', '1866 – 1914', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Războiul de Independență al României a avut loc între anii', '1877-1878', '1818-1819', '1593 - 1601', '1914-1918', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Mihai Viteazul a domnit în Ţara Românească între anii', '1600-1603', '1558-1563', '1593 - 1601', '1599 - 1600', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Cand a avut loc Bătălia de la Călugăreni?', '23 august 1595', '20 mai 1595', '15 octombrie 1595', '1 octombrie 1595', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Ce a avut loc in data de 1 Decembrie 1918?', 'Revoluţia Română', 'Renaşterea Naţională a României', 'Primul Război Mondial', 'Marea Unire de la Alba Iulia', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Realizarea Marii Uniri s-a datorat și Conferinței de Pace de la Versailles din anii?', '1914-1918', '1939-1945', '1940-1944', '1918-1919', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Cum s-a numit teritoriul României de astăzi în secolul I î.Hr?', 'Cetatea Soarelui', 'Dacia', 'Imperiul Roman', 'Drobeta', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Împotriva cui au luptat spartanii în Războiul peloponesiac?', 'atenieni', 'greci', 'aticani', 'sicilieni', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Care stat balcanic a fost condus, din anul 1887, de Ferdinand I de Saxa-Coburg?', 'Bulgaria', 'Ungaria', 'Iugoslavia', 'Ucraina', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Cum se numeşte cel mai vechi document constituţional al Angliei?', 'Manuscrisul de la Ieud', 'Codex Argentus', 'Magna Charta', 'Kamanche', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Când a fost încorporat Egipul în Imperiul Roman?', '40 î.Hr', '41 î.Hr', '30 î.Hr', '45 î.Hr', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Ce armată a fost întemeiată si perfecţionată de Lev Troţki?', 'Armata de Fier', 'Armata Rosie', 'Armata Arsenalul', 'Armata Ungară', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'În ce an a luat în vigoare Codul Civil German?', '1980', '1990', '1800', '1900', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(1, 'Ce manifest a fost publicat în anul 1848?', 'Manifestul comunist', 'Manifestul anticomunist', 'Manifestul liberal', 'Manifestul de la Bamboo', 'A')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Pe ce continent este situata Romania?', 'Asia', 'America', 'Europa', 'Africa', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Ce este Romania?', 'o tara', 'un oras', 'un fluviu', 'un tip de copac', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este cea mai mare tara din lume?', 'China', 'America', 'Rusia', 'Canada', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este cel mai lung fluviu din Europa?', 'Dunarea', 'Volga', 'Tamisa', 'Elba', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este cel mai mare lac din Romania?', 'Sfanta Ana', 'Vidraru', 'Razim', 'Golovita', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este cel mai adanc lac din Romania?', 'Vidraru', 'Golovita', 'Ursu', 'Razim', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este capitala Estoniei?', 'Vaduz', 'Tallin', 'Valleta', 'Skopje', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Capitala Croaţiei este', 'Madrid', 'Copenhaga', 'Kiev', 'Zagreb', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este capitala Maltei?', 'Kiev', 'Valleta', 'Stockholm', 'Amsterdam', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Capitala Insulelor Feroe este', 'Tallinn', 'Vilnius', 'Lisabona', 'Tórshavn', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este capitala Liechtensteinului', 'Vaduz', 'Copenhaga', 'Kiev', 'Sarajevo', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este capitala Albaniei?', 'Andorra', 'Dublin', 'Minsk', 'Tirana', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'În ce oraş se află Muzeul Waiiraf-Richartz?', 'Munchen', 'Koln', 'Frankfurt', 'Hamburg', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Unde se află insula muzeelor?', 'Viena', 'Berlin', 'Amsterdam', 'Paris', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(2, 'Care este capitala Frantei?', 'Paris', 'Madrid', 'Oslo', 'Budapesta', 'A')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Pentru ce epocă muzicală au fost Schumann, Chapin, Schubert şi Mendelssohn-Bartholdy compozitori importanţi?', 'Neomodernism', 'Clasicism', 'Romantism', 'Modernism', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cine a compus muzica din filmul clasic Doctor Jivago?', 'Maurice Jarre', 'Otto Jochum', 'Sidney Jones', 'Patricia Jünger', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cine a scris textul pentru corul final din simfonia nr. 9 de Ludwig van Beethoven, Odă bucuriei?', 'David Friedrich', 'Johann Carl Friedrich Gauss', 'Friedrich Schiller', 'Bruce Friedrich', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'In care oraş austriac situat pe lacul Constanţa are loc din 1946 Festivalul pe o scena plutitoare?', 'Kaprun', 'Bregenz', 'Salzburg', 'Vinzenz', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Când a fost pentru prima dată cântată opera Bărbierul din Sevilla de Rossini?', '1821', '1810', '1814', '1816', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Ce trupă a înfiinţat Paul McCartney după Beatles?', 'The VVings', 'The Rings', 'The Holloway', 'TheOneRing', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cine a cântat Zaraza?', 'Jean-Jacques Rousseau', 'James Jean', 'Jean Craighead George', 'Jean Moscopol', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Care este numele adevărat al muzicianului pop protestatar Bob Dylan?', 'Robert Scoble', 'Robert Zimmermann', 'Robert Altman', 'Robert Doisneau', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cum se numeşte muzica de operetă spaniolă?', 'Zingarella', 'Zarmanela', 'Zarzuella', 'Zarzuepa', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cum se numeşte o chitară cu un corp de rezonanţă din metal?', 'Dobre', 'Dorbo', 'Dobrao', 'Dobro', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Care compozitor german a scris Patimile după Matei (Matthaus-Passion) ?', 'Johann Christoph Bach', 'Johann Samuel Bach', 'Johann Sebastian Bach', 'Georg Christoph Bach', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Ce opere formează ciclul Inelul Nibelungilor de Wagner?', 'Aurul Rinului şi Valkiriile', 'Siegfried şi Amurgul zeilor', 'Valkiriile şi Siegfried', 'Aurul Rinului, Valkiriile, Siegfried şi Amurgul zeilor', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cum se numeşte instrumentul de suflat din lemn cu tub conic si sunet înalt nazal?', 'Ţambal', 'Cheman', 'Oboi', 'Lăută', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Cine a compus Simfonia nr. 9 în mi-minor Din lumea nouă şi a realizat astfel o piatră de holar în muzica simfonică?', 'Antonin Novotny', 'Antonin Rispal', 'Antonin Svoboda', 'Antonin Dvorak', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Ce Trupă a compus hitul Samba Pa Ti?', 'Santana', ' Undias de Tijuca', 'Havana', 'Chorinho', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(3, 'Care compozitor a compus la 6 ani menuete si sonate, iar la 12 ani mai multe opere?', 'Constanze Mozart', 'Antonio Salieri', 'Wolfgang Amadeus Mozart', 'Joseph Haydn', 'C')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'De la cine provine tabloul Armonie în rosu din 1908?', 'Henri Matisse', 'Theodor Pallady', 'Wifredo Lam', 'Gustave Moreau', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cine a pictat tabloul Tarâmul huzurelii?', 'Giuseppe Arcimboldo', 'Gian Lorenzo Bernini', 'Pieter Brueghel cel Batrân', 'William Blake', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cine a pictat tabloul Cafeneaua de noapte?', 'Vincent van Gogh', 'Leonardo da Vinci', 'Paul Gauguin', 'Gustave Moreau', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cu ce pictor a locuit împreuna un timp Paul Gauguin?', 'Pablo Picasso', 'Leonardo da Vinci', 'Vincent van Gogh', 'Caspar David Friedrich', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Care este cel mai cunoscut tablou al pictorului norvegian Advard Munch?', 'Chinul', 'In amurg', 'Moartea', 'Strigatul', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cine a pictat tabloul Maria cu Pruncul dormind din Renaşterea timpurie?', 'Andrea Mantegna', 'Antonello da Messina', 'Giovanni Bellini', 'Gentile da Fabriano', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Care este cel mai faimos suras din arta?', 'Surâsul Femeii Gioconda', 'Surâsul Isabellei of Aragon', 'Surâsul Madonei', 'Surâsul Mona Lisei', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cum se mai numeşte pictura în acuarelă pe pânză?', 'Pictura cu culori acrilice', 'Pictură în guaşă', 'Pictură în ulei', 'Pictura în tempera', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Ce naţionalitate avea pictorul Ferdinand Hodier?', 'Germană', 'Austriacă', 'Franceză', 'Elveţiană', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cine a fost primul artist ce a avut o expoziţie în Louvre la Paris încă din timpul vieţii?', 'Georges de La Tour', 'Georges Brassens', 'Georges Braque', 'Seurat Georges', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Care pictor este considerat prin tonuriie sale pastelate şi culorile luminoase unul dintre precursorii picturii de peisaj engleze?', 'Louis Welden Hawkins', 'David Hockney', 'Thomas Gainsborough', 'Dante Gabriel Rossetti', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(4, 'Cine a pictat tabloul Cele trei graţii?', 'Saint Peter', 'Peter Paul Rubens', 'Peter Stemmler', 'Peter Baumgartner', 'B')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris romanul Jocul cu mărgele de sticlă?', 'Hermann Hesee', 'Klaus Hermann', 'Hermann Ludwig', 'Hermann Minkowski', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris Turandot sau congresul spălătoreselor?', 'Bertolt Brecht', 'Dante Alighieri', 'Lion Feuchtwanger', 'Bruno Walter', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cum se numeşte stilul artistic în care predomină ideea şi conceptul, în timp ce execuţia are o importanţă redusă?', 'Art Nouveau', 'Concept(ual) Art', 'Op art', 'Limbonic Art', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Ce roman a servit ca model pentru filmul îngerul albastru?', 'Rose Manzani de Gregor von Rezzori', 'Trei zile grele de Franz Storch', 'Professor Unrat de Heinrich Mann', 'Strigăte ascunse de Klaus Kessler', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris romanul Ulciorul sfărâmat?', 'Heinrich von Treitsche', 'Heinrich von Kleisf', 'Heinrich von Stephan', 'Wilhelm von Beetz', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris romanul din care s-a inspirat filmul de succes Tăcerea mieilor cu Jodie Foster?', 'Jess Lebow', 'Kim Newman', 'Dennis McKiernan', 'Thomas Harris', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'In ce ani nu a fost acordat Premiul Nobel pentru Literatura?', '1914,1918,1935 si 1940-1943', '1920,1930,1935 si 1940-1943', '1912,1919,1939 si 1940-1943', '1914,1918,1934 si 1942-1945', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Care scriitor german a creat-o pe seducatoarea Lulu?', 'Wolfgang Borchert', 'Edward Albee', 'Lucius Livius Andronicus', 'Frank Wedekind', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris romanul Moarte la Venetia?', 'Sigrid Undset', 'Thomas Mann', 'Sinclair Lewis', 'Goethe', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris tragedia Moartea lui Wallenstein?', 'Friedrich Caspar', 'Friedrich Schiller', 'David Friedrich', 'Friedrich Kellner', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris Confesiunile escrocului Felix Krull?', 'Thomas Mann', 'Paul Thomas', 'Thomas Frey', 'Thomas Scott', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine a scris povestea Hansel si Gretel?', 'Fratii Grimm', 'Lucia si Lammermoor', 'Samson şi Dalila', 'Orfeo şi Euridice', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cine este autorul Amintirilor din copilarie?', 'Ioan Slavici', 'Mihail Sadoveanu', 'Ion Creanga', 'Liviu Rebreanu', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(5, 'Cum se numeste prietenul lui Tom Sawyer din romanul lui Mark Twain?', 'Marjorie Kinnan Rawling', 'Huckleberry Finn', 'Joyce Carol Oates', 'Francine Prose', 'B')

INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Unde este înmânat Palme dOr pentru cel mai bun film?', 'Ashford-International', 'Cannes', 'Saint Pancras', 'Calais-Fréthun', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cum se numeşte regizorul american cu cel mai mare succes din toate timpurile?', 'Steven Spielberg', 'Arthur Fiedler', 'Keith Ockhart', 'James Horner', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Când a apărut în cinematografe filmul despre Beatles A Hard Days Night?', '1964', '1966', '1969', '1973', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cine a cântat în coloana sonoră a filmului Asterix & Obelix împotriva lui Caesar?', 'Maurice Jarre', 'Xavier Naidoo', 'Béla Bartók', ' Bob Dylan', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'In ce film a jucat Paul Newman rolul unui antrenor de hochei pe gheaţă?', 'ActRaiser', 'Huckleberry Finn', 'Combatribes', 'Slap Shot', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cine sunt principalii actori din filmul Cavalerii Mesei-Rotunde?', 'Stewart Granger şi Sean Connery', 'Mel Gibson şi Sean Connery', 'Edward Norton şi Sean Connery', 'Richard Gere şi Sean Connery', 'D')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Ce trofeu de film este acordat în fiecare an la Veneţia?', 'Leul de Aur', 'Tigrul de Aur', 'Pinguinul de Aur', 'Calul de Aur', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Pentru ce film a fost nominalizată la Oscar pentru prima dată la 12 ani Jodie Foster?', 'Five Corners', 'Inside Man', 'Taxi Driver', ' Napoleon and Samantha', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cum se numeşte actorul ce a jucat rolul lui Sherlock Holmes în anii 40?', 'Basil Rafhbone', 'Nigel Bruce', 'David Niven', 'Sherlock Holmes', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Care actor a jucat rolul principal în Forrest Gump ?', 'Robin Williams', 'Al Pacino', 'Tom Hanks', 'Robert De Niro', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cine a jucat rolul principal în Wild Wild West?', 'Will Smith', 'Eddie Murphy', 'Jon Lovitz', 'Courteney Cox', 'A')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'In ce rol a devenit cunoscut Boris Karloff?', 'Route 66', 'The Secret Life of Walter Mitty', 'Rolul monstrului din Frankenstein', 'The Drums of Jeopardy', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cine joacă rolul principal în drama monumentală Spartacus?', 'Alec Guinness', 'Ernest Borgnine', 'Kirk Douglas', 'Eric Douglas', 'C')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Cine a jucat rolul principal în filmul lui Wim Wenders Paris-Texas?', 'Ruth Brigitte Tocki', 'Nastassja Kinski', 'Lisa Kreuzer', 'Sonja Leila', 'B')
INSERT INTO `Question`(categoryId, question, answerA, answerB, answerC, answerD, correctAnswer) VALUES(6, 'Care actriţă este cunoscută ca vânătoarea de vampiri Buffy?', 'Susan Lucci', 'Ana Fidelia Quirot', 'Bernadette Peters', 'Sarah Michelle Gellar', 'D')

INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(1, 9, 1, 1, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(2, 13, 1, 0, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(3, 1, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(4, 12, 0, 1, 1, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(5, 15, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(6, 85, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(7, 86, 0, 1, 1, 1, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(8, 76, 2, 0, 0, 1, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(9, 80, 0, 0, 2, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(10, 82, 0, 0, 3, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(11, 30, 3, 0, 0, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(12, 20, 0, 2, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(13, 17, 3, 0, 0, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(14, 29, 1, 0, 0, 2, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(15, 26, 3, 0, 0, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(16, 27, 0, 0, 0, 2, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(17, 25, 0, 0, 0, 2, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(18, 28, 1, 2, 0, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(19, 19, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(20, 44, 2, 0, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(21, 34, 1, 0, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(22, 39, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(23, 45, 0, 0, 1, 1, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(24, 37, 1, 0, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(25, 54, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(26, 56, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(27, 49, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(28, 58, 1, 0, 0, 1, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(29, 57, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(30, 65, 1, 0, 0, 1, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(31, 60, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(32, 64, 0, 0, 0, 2, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(33, 61, 0, 2, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(34, 72, 0, 3, 0, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(35, 31, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(36, 40, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(37, 38, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(38, 47, 2, 0, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(39, 52, 0, 1, 0, 1, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(40, 48, 0, 0, 0, 2, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(41, 50, 1, 1, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(42, 67, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(43, 63, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(44, 66, 0, 0, 1, 2, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(45, 74, 4, 0, 0, 0, 4);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(46, 84, 1, 1, 2, 1, 5);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(47, 81, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(48, 78, 0, 1, 1, 2, 4);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(49, 77, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(50, 4, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(51, 11, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(52, 14, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(53, 23, 0, 0, 0, 2, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(54, 16, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(55, 22, 0, 2, 0, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(56, 24, 0, 3, 0, 0, 3);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(57, 51, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(58, 59, 0, 1, 0, 1, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(59, 62, 0, 0, 0, 1, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(60, 68, 0, 0, 1, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(61, 75, 1, 0, 1, 0, 2);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(62, 79, 3, 1, 0, 0, 4);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(63, 73, 0, 1, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(64, 87, 1, 0, 0, 0, 1);
INSERT INTO `Question_Statistic` (`statisticId`, `questionId`, `answerA`, `answerB`, `answerC`, `answerD`, `answerNumber`) VALUES(65, 69, 0, 1, 0, 0, 1);

INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(1, 1, 2, 0.6);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(2, 1, 2, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(3, 1, 2, 1);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(4, 1, 1, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(5, 1, 1, 0);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(6, 1, 3, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(7, 1, 3, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(8, 1, 4, 0.2);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(9, 1, 5, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(10, 1, 6, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(11, 1, 1, 0.6);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(12, 1, 2, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(13, 1, 2, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(14, 1, 2, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(15, 1, 2, 1);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(16, 1, 4, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(17, 1, 5, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(18, 1, 6, 0.2);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(19, 1, 6, 0.6);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(20, 1, 6, 0.6);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(21, 1, 5, 0.4);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(22, 1, 6, 0.6);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(23, 1, 6, 1);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(24, 2, 1, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(25, 2, 1, 0);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(26, 2, 2, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(27, 2, 2, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(28, 2, 2, 1);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(29, 2, 3, 0.2);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(30, 2, 3, 0.8);
INSERT INTO `Test_Result` (`id`, `userId`, `categoryId`, `score`) VALUES(31, 2, 5, 0.6);