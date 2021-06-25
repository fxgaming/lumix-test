package lumix.sit;

public class BlockPos {
   public int x;
   public int y;
   public int z;

   public BlockPos(int xPos, int yPos, int zPos) {
      this.x = xPos;
      this.y = yPos;
      this.z = zPos;
   }

   public boolean equals(Object obj) {
      return obj instanceof BlockPos && this.x == ((BlockPos)obj).x && this.y == ((BlockPos)obj).y && this.z == ((BlockPos)obj).z;
   }
}
