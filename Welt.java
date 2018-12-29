
/**
 * @Sam Horn & Moritz Wagner 
 * @1.0
 */
public class Welt
{
    private int xPos, yPos;
    Gegenstand[][] neueWelt = new Gegenstand[50][50];
    
    public Welt()
    {
        neueWelt[0][6] = new Wand();
        neueWelt[0][7] = new Wand();
        neueWelt[0][8] = new Wand();
        neueWelt[0][9] = new Wand();
        neueWelt[0][12] = new Wand();
        neueWelt[0][13] = new Wand();
        neueWelt[0][14] = new Wand();
        neueWelt[0][15] = new Wand();
        
        neueWelt[0][20] = new Baum();
        neueWelt[0][31] = new Baum();
        neueWelt[0][34] = new Baum();
        //
        neueWelt[1][6] = new Wand();
        neueWelt[1][9] = new Wand();
        neueWelt[1][12] = new Wand();
        neueWelt[1][15] = new Wand();
        
        neueWelt[1][20] = new Baum();
        neueWelt[1][31] = new Baum();
        neueWelt[1][34] = new Baum();     
        //
        neueWelt[2][6] = new Wand();
        neueWelt[2][9] = new Wand();
        neueWelt[2][12] = new Wand();
        neueWelt[2][15] = new Wand();
        
        neueWelt[2][20] = new Baum();
        neueWelt[2][31] = new Baum();
        neueWelt[2][34] = new Baum();
        //
        neueWelt[3][6] = new Wand();
        neueWelt[3][9] = new Wand();
        neueWelt[3][12] = new Wand();
        neueWelt[3][13] = new Waffe();
        neueWelt[3][14] = new Waffe();
        neueWelt[3][15] = new Wand();
        
        neueWelt[3][20] = new Baum();
        neueWelt[3][21] = new Baum();
        neueWelt[3][22] = new Baum();
        neueWelt[3][23] = new Baum();
        neueWelt[3][24] = new Baum();
        neueWelt[3][25] = new Baum();
        neueWelt[3][26] = new Baum();
        neueWelt[3][27] = new Baum();
        neueWelt[3][28] = new Baum();
        neueWelt[3][29] = new Baum();
        neueWelt[3][30] = new Baum();
        neueWelt[3][31] = new Baum();
        neueWelt[3][34] = new Baum();
        neueWelt[3][42] = new Baum();
        neueWelt[3][43] = new Baum();
        //
        neueWelt[4][34] = new Baum();
        neueWelt[4][41] = new Baum();
        neueWelt[4][44] = new Baum();
        neueWelt[4][46] = new Baum();
        //
        neueWelt[5][34] = new Baum();
        neueWelt[5][42] = new Baum();
        neueWelt[5][44] = new Baum();
        neueWelt[5][45] = new Baum();
        neueWelt[5][47] = new Baum();
        //
        neueWelt[6][0] = new Wand();
        neueWelt[6][1] = new Wand();
        neueWelt[6][2] = new Wand();
        neueWelt[6][3] = new Wand();
        
        neueWelt[6][20] = new Baum();
        neueWelt[6][21] = new Baum();
        neueWelt[6][22] = new Baum();
        neueWelt[6][23] = new Baum();
        neueWelt[6][24] = new Baum();
        neueWelt[6][25] = new Baum();
        neueWelt[6][26] = new Baum();
        neueWelt[6][27] = new Baum();
        neueWelt[6][28] = new Baum();
        neueWelt[6][29] = new Baum();
        neueWelt[6][30] = new Baum();
        neueWelt[6][31] = new Baum();
        neueWelt[6][34] = new Baum();
        neueWelt[6][42] = new Baum();
        neueWelt[6][47] = new Baum();
        //
        neueWelt[7][0] = new Wand();
        
        neueWelt[7][3] = new Waffe();
        
        neueWelt[7][20] = new Baum();
        neueWelt[7][34] = new Baum();
        neueWelt[7][43] = new Baum();
        neueWelt[7][44] = new Baum();
        neueWelt[7][45] = new Baum();
        neueWelt[7][47] = new Baum();
        //
        neueWelt[8][0] = new Wand();
        
        neueWelt[8][3] = new Waffe();
        
        neueWelt[8][20] = new Baum();
        neueWelt[8][31] = new Baum();
        neueWelt[8][34] = new Baum();
        neueWelt[8][45] = new Baum();
        neueWelt[8][47] = new Baum();
        //
        neueWelt[9][0] = new Wand();
        neueWelt[9][1] = new Wand();
        neueWelt[9][2] = new Wand();
        neueWelt[9][3] = new Wand();
        
        neueWelt[9][10] = new Waffe();
        neueWelt[9][20] = new Baum();
        neueWelt[9][31] = new Baum();
        neueWelt[9][34] = new Baum();
        neueWelt[9][45] = new Baum();
        neueWelt[9][47] = new Baum();
        //
        neueWelt[10][20] = new Baum();
        neueWelt[10][31] = new Baum();
        neueWelt[10][34] = new Baum();
        neueWelt[10][35] = new Baum();
        neueWelt[10][36] = new Baum();
        neueWelt[10][37] = new Baum();
        neueWelt[10][38] = new Baum();
        neueWelt[10][39] = new Baum();
        neueWelt[10][40] = new Baum();
        neueWelt[10][41] = new Baum();
        neueWelt[10][42] = new Baum();
        neueWelt[10][43] = new Baum();
        neueWelt[10][44] = new Baum();
        neueWelt[10][45] = new Baum();
        neueWelt[10][47] = new Busch();
        //
        neueWelt[11][20] = new Baum();
        neueWelt[11][31] = new Baum();
        neueWelt[11][47] = new Baum();
        //
        neueWelt[12][0] = new Wand();
        neueWelt[12][1] = new Wand();
        neueWelt[12][2] = new Wand();
        neueWelt[12][3] = new Wand();
        
        neueWelt[12][20] = new Baum();
        neueWelt[12][31] = new Baum();
        neueWelt[12][45] = new Baum();
        neueWelt[12][46] = new Baum();
        //
        neueWelt[13][0] = new Wand();
        
        neueWelt[13][3] = new Waffe();
        
        neueWelt[13][20] = new Baum();
        neueWelt[13][31] = new Baum();
        neueWelt[13][34] = new Baum();
        neueWelt[13][35] = new Baum();
        neueWelt[13][36] = new Baum();
        neueWelt[13][37] = new Baum();
        neueWelt[13][38] = new Baum();
        neueWelt[13][39] = new Baum();
        neueWelt[13][40] = new Baum();
        neueWelt[13][41] = new Baum();
        neueWelt[13][42] = new Baum();
        neueWelt[13][45] = new Baum();
        //
        neueWelt[14][0] = new Rucksack();
        
        neueWelt[14][3] = new Waffe();
        
        neueWelt[14][20] = new Baum();
        neueWelt[14][24] = new Baum();
        neueWelt[14][25] = new Baum();
        neueWelt[14][26] = new Baum();
        neueWelt[14][27] = new Baum();
        neueWelt[14][31] = new Baum();
        neueWelt[14][34] = new Baum();
        neueWelt[14][42] = new Baum();
        neueWelt[14][45] = new Baum();
        //
        neueWelt[15][0] = new Wand();
        neueWelt[15][1] = new Wand();
        neueWelt[15][2] = new Wand();
        neueWelt[15][3] = new Wand();
        
        neueWelt[15][20] = new Baum();
        neueWelt[15][23] = new Baum();
        neueWelt[15][28] = new Baum();
        neueWelt[15][31] = new Baum();
        neueWelt[15][34] = new Baum();
        neueWelt[15][42] = new Baum();
        neueWelt[15][45] = new Baum();
        //
        neueWelt[16][20] = new Baum();
        neueWelt[16][22] = new Baum();
        neueWelt[16][29] = new Baum();
        neueWelt[16][31] = new Baum();
        neueWelt[16][34] = new Baum();
        neueWelt[16][42] = new Baum();
        neueWelt[16][45] = new Baum();
        //
        neueWelt[17][20] = new Baum();
        neueWelt[17][21] = new Baum();
        neueWelt[17][25] = new Baum();
        neueWelt[17][26] = new Baum();
        neueWelt[17][30] = new Baum();
        neueWelt[17][31] = new Baum();
        neueWelt[17][34] = new Baum();
        neueWelt[17][42] = new Baum();
        neueWelt[17][45] = new Baum();
        //
        neueWelt[18][24] = new Baum();
        neueWelt[18][25] = new Baum();
        neueWelt[18][26] = new Baum();
        neueWelt[18][27] = new Baum();
        neueWelt[18][31] = new Baum();
        neueWelt[18][34] = new Baum();
        neueWelt[18][42] = new Baum();
        neueWelt[18][45] = new Baum();
        //
        neueWelt[19][23] = new Baum();
        neueWelt[19][24] = new Baum();
        neueWelt[19][25] = new Baum();
        neueWelt[19][26] = new Baum();
        neueWelt[19][27] = new Baum();
        neueWelt[19][28] = new Baum();
        neueWelt[19][34] = new Baum();
        neueWelt[19][42] = new Baum();
        neueWelt[19][45] = new Baum();
        //
        neueWelt[20][0] = new Baum();
        neueWelt[20][1] = new Baum();
        neueWelt[20][4] = new Baum();
        neueWelt[20][5] = new Baum();
        neueWelt[20][6] = new Baum();
        neueWelt[20][7] = new Baum();
        neueWelt[20][8] = new Baum();
        neueWelt[20][11] = new Baum();
        neueWelt[20][12] = new Baum();
        neueWelt[20][13] = new Baum();
        neueWelt[20][14] = new Baum();
        neueWelt[20][15] = new Baum();
        neueWelt[20][16] = new Baum();
        neueWelt[20][17] = new Baum();
        neueWelt[20][20] = new Baum();
        neueWelt[20][21] = new Baum();
        neueWelt[20][29] = new Baum();
        neueWelt[20][34] = new Baum();
        neueWelt[20][42] = new Baum();
        neueWelt[20][45] = new Baum();
        //
        neueWelt[21][1] = new Baum();
        neueWelt[21][4] = new Baum();
        neueWelt[21][8] = new Baum();
        neueWelt[21][11] = new Baum();
        neueWelt[21][17] = new Baum();
        neueWelt[21][20] = new Baum();
        neueWelt[21][30] = new Baum();
        neueWelt[21][34] = new Baum();
        neueWelt[21][42] = new Baum();
        neueWelt[21][45] = new Baum();
        //
        neueWelt[22][1] = new Baum();
        neueWelt[22][4] = new Baum();
        neueWelt[22][8] = new Baum();
        neueWelt[22][11] = new Baum();
        neueWelt[22][17] = new Baum();
        neueWelt[22][20] = new Baum();
        neueWelt[22][31] = new Baum();
        neueWelt[22][34] = new Baum();
        neueWelt[22][42] = new Baum();
        neueWelt[22][45] = new Baum();
        //
        neueWelt[23][1] = new Baum();
        neueWelt[23][4] = new Baum();
        neueWelt[23][8] = new Baum();
        neueWelt[23][11] = new Baum();
        neueWelt[23][17] = new Baum();
        neueWelt[23][20] = new Baum();
        neueWelt[23][31] = new Baum();
        neueWelt[23][34] = new Baum();
        neueWelt[23][42] = new Baum();
        neueWelt[23][45] = new Baum();
        //
        neueWelt[24][31] = new Wand();
        neueWelt[24][32] = new Waffe();
        neueWelt[24][33] = new Waffe();
        neueWelt[24][34] = new Wand();
        
        neueWelt[24][1] = new Baum();
        neueWelt[24][4] = new Baum();
        neueWelt[24][8] = new Baum();
        neueWelt[24][11] = new Baum();
        neueWelt[24][17] = new Baum();
        neueWelt[24][20] = new Baum();
        neueWelt[24][42] = new Baum();
        neueWelt[24][45] = new Baum();
        //
        neueWelt[25][31] = new Wand();
        neueWelt[25][34] = new Wand();
        
        neueWelt[25][1] = new Baum();
        neueWelt[25][4] = new Baum();
        neueWelt[25][8] = new Baum();
        neueWelt[25][11] = new Baum();
        neueWelt[25][17] = new Baum();
        neueWelt[25][20] = new Baum();
        neueWelt[25][42] = new Baum();
        neueWelt[25][45] = new Baum();
        //
        neueWelt[26][31] = new Wand();
        neueWelt[26][34] = new Wand();
        
        neueWelt[26][1] = new Baum();
        neueWelt[26][4] = new Baum();
        neueWelt[26][8] = new Baum();
        neueWelt[26][11] = new Baum();
        neueWelt[26][17] = new Baum();
        neueWelt[26][20] = new Baum();
        neueWelt[26][42] = new Baum();
        neueWelt[26][45] = new Baum();
        //
        neueWelt[27][31] = new Wand();
        neueWelt[27][32] = new Wand();
        neueWelt[27][33] = new Wand();
        neueWelt[27][34] = new Wand();
        
        neueWelt[27][1] = new Baum();
        neueWelt[27][4] = new Baum();
        neueWelt[27][8] = new Baum();
        neueWelt[27][11] = new Baum();
        neueWelt[27][16] = new Baum();
        neueWelt[27][20] = new Baum();
        neueWelt[27][42] = new Baum();
        neueWelt[27][45] = new Baum();
        //
        neueWelt[28][1] = new Baum();
        neueWelt[28][4] = new Baum();
        neueWelt[28][8] = new Baum();
        neueWelt[28][11] = new Baum();
        neueWelt[28][15] = new Baum();
        neueWelt[28][20] = new Baum();
        neueWelt[28][42] = new Baum();
        neueWelt[28][45] = new Baum();
        //
        neueWelt[29][1] = new Baum();
        neueWelt[29][4] = new Baum();
        neueWelt[29][8] = new Baum();
        neueWelt[29][11] = new Baum();
        neueWelt[29][14] = new Baum();
        neueWelt[29][20] = new Baum();
        neueWelt[29][42] = new Baum();
        neueWelt[29][45] = new Baum();
        //
        neueWelt[29][1] = new Baum();
        neueWelt[29][4] = new Baum();
        neueWelt[29][8] = new Baum();
        neueWelt[29][11] = new Baum();
        neueWelt[29][14] = new Baum();
        neueWelt[29][20] = new Baum();
        neueWelt[29][42] = new Baum();
        neueWelt[29][45] = new Baum();
        //
        neueWelt[30][1] = new Baum();
        neueWelt[30][4] = new Baum();
        neueWelt[30][8] = new Baum();
        neueWelt[30][11] = new Baum();
        neueWelt[30][13] = new Baum();
        neueWelt[30][17] = new Baum();
        neueWelt[30][20] = new Baum();
        neueWelt[30][42] = new Baum();
        neueWelt[30][45] = new Baum();
        //
        neueWelt[31][1] = new Baum();
        neueWelt[31][4] = new Baum();
        neueWelt[31][8] = new Baum();
        neueWelt[31][11] = new Baum();
        neueWelt[31][12] = new Baum();
        neueWelt[31][16] = new Baum();
        neueWelt[31][17] = new Baum();
        neueWelt[31][20] = new Baum();
        neueWelt[31][41] = new Baum();
        neueWelt[31][45] = new Baum();
        //
        neueWelt[32][1] = new Baum();
        neueWelt[32][4] = new Baum();
        neueWelt[32][8] = new Baum();
        neueWelt[32][11] = new Baum();
        neueWelt[32][15] = new Baum();
        neueWelt[32][17] = new Baum();
        neueWelt[32][20] = new Baum();
        neueWelt[32][21] = new Baum();
        neueWelt[32][22] = new Baum();
        neueWelt[32][23] = new Baum();
        neueWelt[32][24] = new Baum();
        neueWelt[32][25] = new Baum();
        neueWelt[32][26] = new Baum();
        neueWelt[32][27] = new Baum();
        neueWelt[32][28] = new Baum();
        neueWelt[32][29] = new Baum();
        neueWelt[32][40] = new Baum();
        neueWelt[32][44] = new Baum();
        //
        neueWelt[33][1] = new Baum();
        neueWelt[33][4] = new Baum();
        neueWelt[33][8] = new Baum();
        neueWelt[33][14] = new Baum();
        neueWelt[33][17] = new Baum();
        neueWelt[33][30] = new Baum();
        neueWelt[33][39] = new Baum();
        neueWelt[33][43] = new Baum();
        //
        neueWelt[34][1] = new Baum();
        neueWelt[34][4] = new Baum();
        neueWelt[34][8] = new Baum();
        neueWelt[34][13] = new Baum();
        neueWelt[34][17] = new Baum();
        neueWelt[34][31] = new Baum();
        neueWelt[34][38] = new Baum();
        neueWelt[34][42] = new Baum();
        //
        neueWelt[35][1] = new Baum();
        neueWelt[35][4] = new Baum();
        neueWelt[35][8] = new Baum();
        neueWelt[35][12] = new Baum();
        neueWelt[35][17] = new Baum();
        neueWelt[35][20] = new Baum();
        neueWelt[35][21] = new Baum();
        neueWelt[35][22] = new Baum();
        neueWelt[35][23] = new Baum();
        neueWelt[35][24] = new Baum();
        neueWelt[35][25] = new Baum();
        neueWelt[35][26] = new Baum();
        neueWelt[35][27] = new Baum();
        neueWelt[35][28] = new Baum();
        neueWelt[35][32] = new Baum();
        neueWelt[35][37] = new Baum();
        neueWelt[35][41] = new Baum();
        //
        neueWelt[36][1] = new Baum();
        neueWelt[36][4] = new Baum();
        neueWelt[36][5] = new Baum();
        neueWelt[36][6] = new Baum();
        neueWelt[36][7] = new Baum();
        neueWelt[36][11] = new Baum();
        neueWelt[36][17] = new Baum();
        neueWelt[36][20] = new Baum();
        neueWelt[36][29] = new Baum();
        neueWelt[36][40] = new Baum();
        //
        neueWelt[37][1] = new Baum();
        neueWelt[37][10] = new Baum();
        neueWelt[37][17] = new Baum();
        neueWelt[37][20] = new Baum();
        neueWelt[37][30] = new Baum();
        neueWelt[37][39] = new Baum();
        //
        neueWelt[38][1] = new Baum();
        neueWelt[38][9] = new Baum();
        neueWelt[38][17] = new Baum();
        neueWelt[38][20] = new Baum();
        neueWelt[38][31] = new Baum();
        neueWelt[38][32] = new Baum();
        neueWelt[38][33] = new Baum();
        neueWelt[38][34] = new Baum();
        neueWelt[38][35] = new Baum();
        neueWelt[38][36] = new Baum();
        neueWelt[38][37] = new Baum();
        neueWelt[38][38] = new Baum();
        //
        neueWelt[39][1] = new Baum();
        neueWelt[39][4] = new Baum();
        neueWelt[39][5] = new Baum();
        neueWelt[39][6] = new Baum();
        neueWelt[39][7] = new Baum();
        neueWelt[39][8] = new Baum();
        neueWelt[39][17] = new Baum();
        neueWelt[39][20] = new Baum();
        //
        neueWelt[40][1] = new Baum();
        neueWelt[40][4] = new Baum();
        neueWelt[40][17] = new Baum();
        neueWelt[40][20] = new Baum();
        neueWelt[40][26] = new Baum();
        neueWelt[40][27] = new Baum();
        neueWelt[40][28] = new Baum();
        neueWelt[40][29] = new Baum();
        neueWelt[40][30] = new Baum();
        neueWelt[40][31] = new Baum();
        neueWelt[40][32] = new Baum();
        neueWelt[40][33] = new Baum();
        neueWelt[40][34] = new Baum();
        //
        neueWelt[41][1] = new Baum();
        neueWelt[41][4] = new Baum();
        neueWelt[41][17] = new Baum();
        neueWelt[41][20] = new Baum();
        neueWelt[41][25] = new Baum();
        neueWelt[41][35] = new Baum();
        //
        neueWelt[42][1] = new Baum();
        neueWelt[42][4] = new Baum();
        neueWelt[42][17] = new Baum();
        neueWelt[42][20] = new Baum();
        neueWelt[42][23] = new Baum();
        neueWelt[42][24] = new Baum();
        neueWelt[42][36] = new Baum();
        neueWelt[42][37] = new Baum();
        //
        neueWelt[43][1] = new Baum();
        neueWelt[43][4] = new Baum();
        neueWelt[43][17] = new Baum();
        neueWelt[43][20] = new Baum();
        neueWelt[43][21] = new Baum();
        neueWelt[43][22] = new Baum();
        neueWelt[43][28] = new Baum();
        neueWelt[43][29] = new Baum();
        neueWelt[43][30] = new Baum();
        neueWelt[43][31] = new Baum();
        neueWelt[43][32] = new Baum();
        neueWelt[43][38] = new Baum();
        neueWelt[43][39] = new Baum();
        //
        neueWelt[44][0] = new Baum();
        neueWelt[44][1] = new Baum();
        neueWelt[44][4] = new Baum();
        neueWelt[44][5] = new Baum();
        neueWelt[44][6] = new Baum();
        neueWelt[44][7] = new Baum();
        neueWelt[44][8] = new Baum();
        neueWelt[44][9] = new Baum();
        neueWelt[44][10] = new Baum();
        neueWelt[44][11] = new Baum();
        neueWelt[44][12] = new Baum();
        neueWelt[44][13] = new Baum();
        neueWelt[44][14] = new Baum();
        neueWelt[44][15] = new Baum();
        neueWelt[44][16] = new Baum();
        neueWelt[44][17] = new Baum();
        neueWelt[44][20] = new Baum();
        neueWelt[44][26] = new Baum();
        neueWelt[44][27] = new Baum();
        neueWelt[44][33] = new Baum();
        neueWelt[44][34] = new Baum();
        neueWelt[44][45] = new Baum();
        neueWelt[44][46] = new Baum();
        neueWelt[44][47] = new Baum();
        neueWelt[44][48] = new Baum();
        neueWelt[44][49] = new Baum();
        //
        neueWelt[45][24] = new Baum();
        neueWelt[45][25] = new Baum();
        neueWelt[45][35] = new Baum();
        neueWelt[45][36] = new Baum();
        neueWelt[45][41] = new Baum();
        neueWelt[45][44] = new Baum();
        //
        neueWelt[46][22] = new Baum();
        neueWelt[46][23] = new Baum();
        neueWelt[46][37] = new Baum();
        neueWelt[46][38] = new Baum();
        neueWelt[46][42] = new Baum();
        neueWelt[46][44] = new Baum();
        //
        neueWelt[47][0] = new Baum();
        neueWelt[47][1] = new Baum();
        neueWelt[47][4] = new Baum();
        neueWelt[47][5] = new Baum();
        neueWelt[47][6] = new Baum();
        neueWelt[47][7] = new Baum();
        neueWelt[47][8] = new Baum();
        neueWelt[47][9] = new Baum();
        neueWelt[47][10] = new Baum();
        neueWelt[47][11] = new Baum();
        neueWelt[47][12] = new Baum();
        neueWelt[47][13] = new Baum();
        neueWelt[47][14] = new Baum();
        neueWelt[47][15] = new Baum();
        neueWelt[47][16] = new Baum();
        neueWelt[47][17] = new Baum();
        neueWelt[47][18] = new Baum();
        neueWelt[47][19] = new Baum();
        neueWelt[47][20] = new Baum();
        neueWelt[47][21] = new Baum();
        neueWelt[47][39] = new Baum();
        neueWelt[47][43] = new Baum();
        neueWelt[47][44] = new Baum();
        //
        neueWelt[48][1] = new Baum();
        neueWelt[48][4] = new Baum();
        neueWelt[48][40] = new Baum();
        
        neueWelt[48][43] = new Busch();
        neueWelt[48][44] = new Busch();
        //
        neueWelt[49][1] = new Baum();
        neueWelt[49][4] = new Baum();
        neueWelt[49][41] = new Baum();
        
        neueWelt[49][43] = new Busch();
        neueWelt[49][44] = new Busch();
    }
    public void setFeld(int x, int y, Gegenstand pGegenstand){
        neueWelt[x][y]=pGegenstand;
    }
    public Gegenstand getFeld(int xPos, int yPos)
    {
       return neueWelt[xPos][yPos];
    }
    public void leereFeld(int x, int y){
        neueWelt[x][y]=null;
    }
    public boolean feldIstBegehbar(int xPos, int yPos)
    {
        boolean wert=false;
            if(xPos>=0&&yPos>=0){
                try
                {
                    if(getFeld(xPos, yPos).getName()!="wand"&&getFeld(xPos, yPos).getName()!="baum"&&getFeld(xPos, yPos).getName()!="busch"){
                        wert=true;
                    }
                }
                catch(NullPointerException e){
                    wert=true;
                }
            }
          return wert;    
        }
    public boolean feldIstLeer(int xPos, int yPos){
        if(getFeld(xPos, yPos)==null)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
