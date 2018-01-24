import groovy.xml.MarkupBuilder

/**
 * <collection shelf = "New Arrivals"> 

   <movie title = "Enemy Behind"> 
      <type>War, Thriller</type> 
      <format>DVD</format> 
      <year>2003</year> 
      <rating>PG</rating> 
      <stars>10</stars> 
      <description>Talk about a US-Japan war</description> 
   </movie> 
    
   <movie title = "Transformers"> 
      <type>Anime, Science Fiction</type>
      <format>DVD</format> 
      <year>1989</year> 
      <rating>R</rating> 
      <stars>8</stars> 
      <description>A schientific fiction</description> 
   </movie> 
    
   <movie title = "Trigun"> 
      <type>Anime, Action</type> 
      <format>DVD</format> 
      <year>1986</year> 
      <rating>PG</rating> 
      <stars>10</stars> 
      <description>Vash the Stam pede!</description> 
   </movie> 
    
   <movie title = "Ishtar"> 
      <type>Comedy</type> 
      <format>VHS</format> 
      <year>1987</year> 
      <rating>PG</rating> 
      <stars>2</stars> 
      <description>Viewable boredom </description> 
   </movie> 
    
</collection> 
 * 
 */

 static void main(def args)
 {
     /**
      * 创建xml文件
      */
     /*def mb = new MarkupBuilder();//创建节点构造器
     mb.collection(shelf:'New Arrivals', {
        move(title:'Enemy Behind')
        type('War, Thriller')
        format('DVD')
        year('2003')
        rating('PG')
        stars(10)
        description('Talk about a US-Japan war') 
     });*/
     
     /**
      * 动态赋值
      */
//     def mp = [1 : ['Enemy Behind', 'War, Thriller', 'DVD', '2003',
//         'PG', '10', 'Talk about a US-Japan war'],
//         2 : ['Transformers','Anime, Science Fiction','DVD','1989',
//         'R', '8','A scientific fiction'],
//         3 : ['Trigun','Anime, Action','DVD','1986',
//         'PG', '10','Vash the Stam pede'],
//         4 : ['Ishtar','Comedy','VHS','1987', 'PG',
//         '2','Viewable boredom ']
//         ]
//         
//    def mb = new MarkupBuilder();
//         
//     mb.collection(shelf:'New Arrivals', {
//             mp.each({
//                 sb ->
//                 move(title:sb.value[0])
//                 type(sb.value[1]);
//                 format(sb.value[2])
//                 year(sb.value[3])
//                 rating(sb.value[4])
//                 stars(sb.value[5])
//                 description(sb.value[6])
//             });
//         });
     
     /**
      * XML解析
      */
     
     def parser = new XmlParser();
     //取得根目录路径
     String rootPath = System.getProperty("user.dir");
     println rootPath;
     def doc = parser.parse(rootPath + File.separator + "src\\groovy\\Movies.xml");
     doc.movie.each({
         sd ->
             println "movie name: ${sd['@title']}";
             println "movie type: ${sd.type[0].text()}";
             println "movie format: ${sd.format[0].text()}";
             println "movie year: ${sd.year[0].text()}";
             println "movie rating: ${sd.rating[0].text()}";
             println "movie stars: ${sd.stars[0].text()}";
             println "movie description: ${sd.description[0].text()}";
             println "**********************************************";
     });
 }
