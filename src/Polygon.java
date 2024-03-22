public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }
    public Polygon(Polygon polygon){
        this.points = new Point[polygon.points.length];
        for(int i = 0;i<polygon.points.length;++i){
            points[i] = new Point(polygon.points[i].x,polygon.points[i].y);
        }
    }
    public String toSvg(){
        StringBuilder poly = new StringBuilder();
        poly.append("<polygon points=\"");
        for(Point point: points){
            poly.append(point.x).append(",").append(point.y).append(" ");
        }
        poly.append("\" style=\"fill:none;stroke:black;stroke-width:1\"/>\n");
        return poly.toString();
    }


}