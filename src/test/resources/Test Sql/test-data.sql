/* POST PARTS */
insert into POST_PART(POST_PART_ID, BODY) VALUES(1, 'This is the first test');
insert into POST_PART(POST_PART_ID, BODY) VALUES(2, 'This is my test');
insert into POST_PART(POST_PART_ID, BODY) VALUES(3, 'This is my test');
insert into POST_PART(POST_PART_ID, BODY) VALUES(4, 'This is my delete test');

/* TAGS */
insert into TAG VALUES(1, 'Spring');
insert into TAG VALUES(2, 'Java');
insert into TAG VALUES(3, 'Delete');
insert into TAG VALUES(4, 'Spring Data');

/* POSTS */
insert into POST VALUES(1, 'My first post', 'Kevin Bowersox', 1, '2012-10-12');
insert into POST VALUES(2, 'My first post', 'Kevin Bowersox', 2, '2012-10-12');
insert into POST VALUES(3, 'My first post', 'Kevin Bowersox', 3, '2012-10-12');
insert into POST VALUES(4, 'My first post', 'Kevin Bowersox', 4, '2012-10-12');

insert into POST_TAG VALUES(1, 1);
insert into POST_TAG VALUES(1, 2);
insert into POST_TAG VALUES(2, 1);
insert into POST_TAG VALUES(3, 2);

insert into IMAGE VALUES(1, 'Java.png', '.png',null);
insert into IMAGE VALUES(2, 'Spring.png', '.png',null);

insert into SKILL_CATEGORY VALUES(1, 'Programming Skills');
insert into SKILL_CATEGORY VALUES(2, 'People Skills');

insert into SKILL VALUES(1, 'Java', 5, 'The Java Programming Language', 'Oracle', 'http://www.java.com', 2, 1, 1);

insert into EXPERIENCE VALUES(1, '2009-7-20', '2012-11-20', 'This is my current position', 'Web Application Developer', 'NAVSUP BSC', 'N');
insert into EXPERIENCE VALUES(2, '2008-1-1', '2009-7-20', 'This is was my former position', 'Cognos Developer', 'BI Solutions', 'N');

insert into EXPERIENCE_DETAIL VALUES(1, 'I wrote a bunch of clean code.', 1);
insert into EXPERIENCE_DETAIL VALUES(2, 'I worked with ORMs', 1);
insert into EXPERIENCE_DETAIL VALUES(3, 'I created a bunch of apps.', 1);
insert into EXPERIENCE_DETAIL VALUES(4, 'I wrote javascript', 2);
insert into EXPERIENCE_DETAIL VALUES(5, 'I made cognos reports', 2);

insert into EXPERIENCE_TAG VALUES(1, 1, 1);
insert into EXPERIENCE_TAG VALUES(2, 1, 2);
insert into EXPERIENCE_TAG VALUES(3, 1, 4);
