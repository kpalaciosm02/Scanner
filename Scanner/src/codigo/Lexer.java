/* The following code was generated by JFlex 1.4.3 on 30/9/23, 18:50 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30/9/23, 18:50 from the specification file
 * <tt>C:/Users/kenda/OneDrive/Documentos/GitHub/Scanner/Scanner/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\35\1\36\2\0\1\35\22\0\1\35\1\0\1\60\5\0"+
    "\1\50\1\51\1\40\1\45\1\43\1\5\1\55\1\34\1\6\11\2"+
    "\1\54\1\44\1\47\1\42\1\46\2\0\1\7\1\12\1\21\1\24"+
    "\1\4\1\26\1\13\1\23\1\14\1\57\1\31\1\17\1\32\1\15"+
    "\1\16\1\30\1\57\1\10\1\22\1\20\1\27\1\33\1\25\1\56"+
    "\1\11\1\57\1\52\1\0\1\53\1\0\1\1\1\0\1\7\1\12"+
    "\1\21\1\24\1\4\1\26\1\13\1\23\1\14\1\57\1\31\1\17"+
    "\1\32\1\15\1\16\1\30\1\57\1\10\1\22\1\20\1\27\1\33"+
    "\1\25\1\56\1\11\1\57\1\37\1\3\1\41\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\2\23\4"+
    "\1\6\1\1\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\4"+
    "\1\1\1\0\3\4\1\24\1\25\7\4\2\26\2\4"+
    "\1\27\13\4\1\26\14\4\1\0\1\30\2\0\1\3"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\2\42\1\4\1\0\1\43\1\4\1\26\2\4"+
    "\1\44\7\4\1\45\7\4\1\46\5\4\1\26\4\4"+
    "\1\47\1\0\1\50\1\51\1\0\1\42\1\52\1\0"+
    "\1\53\1\4\1\26\22\4\1\0\1\42\1\4\1\26"+
    "\15\4\1\26\10\4\1\26\4\4\1\26\2\4\1\26"+
    "\166\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[317];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467"+
    "\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\61\0\61\0\61"+
    "\0\u058d\0\u05be\0\u05ef\0\61\0\61\0\61\0\61\0\u0620"+
    "\0\u0651\0\u0682\0\u06b3\0\u0651\0\u06e4\0\u0715\0\u0746\0\61"+
    "\0\61\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d"+
    "\0\u08ce\0\u06e4\0\u08ff\0\u0930\0\u06e4\0\u0961\0\u0992\0\u09c3"+
    "\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b"+
    "\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3"+
    "\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9\0\61\0\u0e2a"+
    "\0\u0e5b\0\61\0\61\0\61\0\61\0\61\0\u0e8c\0\61"+
    "\0\61\0\u0ebd\0\61\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\61"+
    "\0\u0fb2\0\u0fb2\0\u0fe3\0\u1014\0\u0fb2\0\u1045\0\u1076\0\u10a7"+
    "\0\u10d8\0\u1109\0\u113a\0\u116b\0\u0fb2\0\u119c\0\u11cd\0\u11fe"+
    "\0\u122f\0\u1260\0\u1291\0\u12c2\0\u0fb2\0\u12f3\0\u1324\0\u1355"+
    "\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u144a\0\u147b\0\u14ac\0\u0fb2"+
    "\0\u14dd\0\61\0\61\0\u150e\0\u153f\0\u0fb2\0\u1570\0\61"+
    "\0\u15a1\0\u15a1\0\u15d2\0\u1603\0\u1634\0\u1665\0\u1696\0\u16c7"+
    "\0\u16f8\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed\0\u181e\0\u184f"+
    "\0\u1880\0\u18b1\0\u18e2\0\u1913\0\u1944\0\61\0\u1975\0\u1975"+
    "\0\u19a6\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd"+
    "\0\u1b2e\0\u1b5f\0\u1b90\0\u1bc1\0\u1bf2\0\u1bf2\0\u1c23\0\u1c54"+
    "\0\u1c85\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1d7a\0\u1dab"+
    "\0\u1ddc\0\u1e0d\0\u1e3e\0\u1e3e\0\u1e6f\0\u1ea0\0\u1ea0\0\u1ed1"+
    "\0\u1f02\0\u1f33\0\u1f64\0\u1f95\0\u1fc6\0\u1ff7\0\u2028\0\u2059"+
    "\0\u208a\0\u20bb\0\u20ec\0\u211d\0\u214e\0\u217f\0\u21b0\0\u21e1"+
    "\0\u2212\0\u2243\0\u2274\0\u22a5\0\u22d6\0\u2307\0\u2338\0\u2369"+
    "\0\u239a\0\u23cb\0\u23fc\0\u242d\0\u245e\0\u248f\0\u24c0\0\u24f1"+
    "\0\u2522\0\u2553\0\u2584\0\u25b5\0\u25e6\0\u2617\0\u2648\0\u2679"+
    "\0\u26aa\0\u26db\0\u270c\0\u273d\0\u276e\0\u279f\0\u27d0\0\u2801"+
    "\0\u2832\0\u2863\0\u2894\0\u28c5\0\u28f6\0\u2927\0\u2958\0\u2989"+
    "\0\u29ba\0\u29eb\0\u2a1c\0\u2a4d\0\u2a7e\0\u2aaf\0\u2ae0\0\u2b11"+
    "\0\u2b42\0\u2b73\0\u2ba4\0\u2bd5\0\u2c06\0\u2c37\0\u2c68\0\u2c99"+
    "\0\u2cca\0\u2cfb\0\u2d2c\0\u2d5d\0\u2d8e\0\u2dbf\0\u2df0\0\u2e21"+
    "\0\u2e52\0\u2e83\0\u2eb4\0\u2ee5\0\u2f16\0\u2f47\0\u2f78\0\u2fa9"+
    "\0\u2fda\0\u300b\0\u303c\0\u306d\0\u309e\0\u30cf\0\u3100\0\u3131"+
    "\0\u3162\0\u3193\0\u31c4\0\u31f5\0\u3226\0\u3257\0\u3288\0\u32b9"+
    "\0\u32ea\0\u331b\0\u334c\0\u337d\0\u33ae\0\u33df\0\u3410\0\u3441"+
    "\0\u3472\0\u34a3\0\u34d4\0\u3505\0\61";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[317];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\12\1\24\1\25\1\26\1\27\1\30"+
    "\1\12\1\31\1\32\1\33\2\4\1\34\1\35\1\2"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\12\1\53\63\0"+
    "\1\3\3\0\1\3\46\0\1\54\6\0\1\4\31\0"+
    "\2\4\23\0\2\55\1\0\1\55\1\0\7\55\1\56"+
    "\1\55\1\57\14\55\22\0\2\55\6\0\1\60\34\0"+
    "\1\61\73\0\1\54\4\0\2\55\1\0\1\55\1\0"+
    "\2\55\1\62\4\55\1\63\16\55\22\0\2\55\2\0"+
    "\2\55\1\0\1\64\1\0\26\55\22\0\2\55\2\0"+
    "\2\55\1\0\1\55\1\0\26\55\22\0\2\55\2\0"+
    "\2\55\1\0\1\65\1\0\3\55\1\66\4\55\1\67"+
    "\15\55\22\0\2\55\2\0\2\55\1\0\1\55\1\0"+
    "\10\55\1\70\15\55\22\0\2\55\2\0\2\55\1\0"+
    "\1\55\1\0\7\55\1\71\10\55\1\72\5\55\22\0"+
    "\2\55\2\0\2\55\1\0\1\55\1\0\6\55\1\73"+
    "\1\55\1\74\15\55\22\0\2\55\2\0\2\55\1\0"+
    "\1\55\1\0\2\55\1\75\15\55\1\72\5\55\22\0"+
    "\2\55\2\0\2\55\1\0\1\55\1\0\1\55\1\76"+
    "\6\55\1\77\15\55\22\0\2\55\2\0\2\55\1\0"+
    "\1\55\1\0\2\55\1\100\1\101\4\55\1\72\4\55"+
    "\1\102\10\55\22\0\2\55\2\0\2\55\1\0\1\55"+
    "\1\0\1\55\1\57\6\55\1\103\4\55\1\104\10\55"+
    "\22\0\2\55\2\0\2\55\1\0\1\105\1\0\12\55"+
    "\1\106\2\55\1\107\10\55\22\0\2\55\2\0\2\55"+
    "\1\0\1\55\1\0\6\55\1\110\1\55\1\111\15\55"+
    "\22\0\2\55\2\0\2\55\1\0\1\55\1\0\2\55"+
    "\1\112\3\55\1\113\6\55\1\114\10\55\22\0\2\55"+
    "\2\0\2\55\1\0\1\55\1\0\1\55\1\115\4\55"+
    "\1\116\1\55\1\117\10\55\1\120\4\55\22\0\2\55"+
    "\2\0\2\55\1\0\1\55\1\0\7\55\1\121\16\55"+
    "\22\0\2\55\2\0\2\55\1\0\1\55\1\0\1\55"+
    "\1\122\1\123\23\55\22\0\2\55\2\0\2\55\1\0"+
    "\1\55\1\0\10\55\1\124\15\55\22\0\2\55\2\0"+
    "\2\55\1\0\1\55\1\0\1\55\1\125\24\55\22\0"+
    "\2\55\35\0\1\126\5\0\1\127\17\0\2\130\1\0"+
    "\1\130\1\0\26\130\4\0\1\131\1\132\14\0\2\130"+
    "\43\0\1\133\60\0\1\134\2\0\1\135\55\0\1\136"+
    "\3\0\1\137\54\0\1\140\3\0\1\141\1\142\53\0"+
    "\1\143\20\0\1\144\3\0\1\145\53\0\2\55\1\0"+
    "\1\55\1\0\10\55\1\146\15\55\22\0\2\55\2\0"+
    "\2\147\1\0\1\147\1\0\26\147\22\0\2\147\1\150"+
    "\1\0\2\151\1\0\1\151\1\0\26\151\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\16\151\1\152\7\151"+
    "\22\0\2\151\2\0\2\151\1\0\1\151\1\0\14\151"+
    "\1\153\11\151\22\0\2\151\2\0\2\151\1\0\1\151"+
    "\1\0\2\151\1\154\23\151\22\0\2\151\2\0\2\151"+
    "\1\0\1\151\1\0\16\151\1\155\7\151\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\1\151\1\156\11\151"+
    "\1\157\6\151\1\160\3\151\22\0\2\151\2\0\2\151"+
    "\1\0\1\151\1\0\5\151\1\161\20\151\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\12\151\1\153\13\151"+
    "\22\0\2\151\2\0\2\151\1\0\1\151\1\0\10\151"+
    "\1\162\15\151\22\0\2\151\2\0\2\151\1\0\1\151"+
    "\1\0\12\151\1\163\13\151\22\0\2\151\2\0\2\151"+
    "\1\0\1\151\1\0\11\151\1\164\1\152\13\151\22\0"+
    "\2\151\2\0\2\151\1\0\1\151\1\0\11\151\1\152"+
    "\14\151\22\0\2\151\2\0\2\151\1\0\1\151\1\0"+
    "\12\151\1\165\13\151\22\0\2\151\2\0\2\151\1\0"+
    "\1\151\1\0\4\151\1\166\21\151\22\0\2\151\2\0"+
    "\2\151\1\0\1\151\1\0\7\151\1\167\16\151\22\0"+
    "\2\151\2\0\2\151\1\0\1\151\1\0\21\151\1\153"+
    "\4\151\22\0\2\151\2\0\2\151\1\0\1\151\1\0"+
    "\22\151\1\153\3\151\22\0\2\151\2\0\2\151\1\0"+
    "\1\170\1\0\26\151\22\0\2\151\2\0\2\151\1\0"+
    "\1\151\1\0\7\151\1\171\16\151\22\0\2\151\2\0"+
    "\2\151\1\0\1\151\1\0\1\151\1\172\24\151\22\0"+
    "\2\151\2\0\2\151\1\0\1\151\1\0\12\151\1\152"+
    "\13\151\22\0\2\151\2\0\2\151\1\0\1\151\1\0"+
    "\2\151\1\173\23\151\22\0\2\151\2\0\2\151\1\0"+
    "\1\151\1\0\10\151\1\174\15\151\22\0\2\151\2\0"+
    "\2\151\1\0\1\151\1\0\25\151\1\175\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\17\151\1\176\6\151"+
    "\22\0\2\151\2\0\2\151\1\0\1\151\1\0\6\151"+
    "\1\177\17\151\22\0\2\151\2\0\2\151\1\0\1\151"+
    "\1\0\12\151\1\200\13\151\22\0\2\151\2\0\2\151"+
    "\1\0\1\151\1\0\6\151\1\201\17\151\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\11\151\1\202\14\151"+
    "\22\0\2\151\2\0\2\151\1\0\1\151\1\0\11\151"+
    "\1\153\14\151\22\0\2\151\2\0\2\151\1\0\1\151"+
    "\1\0\2\151\1\203\23\151\22\0\2\151\2\0\2\151"+
    "\1\0\1\151\1\0\7\151\1\204\16\151\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\12\151\1\205\13\151"+
    "\22\0\2\151\2\0\2\151\1\0\1\151\1\0\13\151"+
    "\1\206\12\151\22\0\2\151\2\0\2\151\1\0\1\151"+
    "\1\0\10\151\1\207\15\151\22\0\2\151\2\0\2\151"+
    "\1\0\1\151\1\0\16\151\1\210\7\151\22\0\2\151"+
    "\2\0\2\151\1\0\1\151\1\0\2\151\1\152\23\151"+
    "\22\0\2\151\2\0\2\126\1\0\1\126\1\0\26\126"+
    "\1\0\1\126\1\132\17\0\2\126\2\0\2\130\1\0"+
    "\1\130\1\0\26\130\5\0\1\132\14\0\2\130\2\0"+
    "\2\131\1\0\1\131\1\0\26\131\4\0\1\211\15\0"+
    "\2\131\43\0\1\212\60\0\1\213\20\0\1\144\1\0"+
    "\1\214\1\0\1\144\54\0\1\215\1\0\1\214\55\0"+
    "\2\151\1\0\1\151\1\0\2\151\1\216\23\151\22\0"+
    "\2\151\2\0\2\217\1\0\1\217\1\0\26\217\22\0"+
    "\2\217\1\220\1\0\2\221\1\0\1\221\1\0\26\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\222\1\0\26\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\221\1\0\1\221"+
    "\1\223\24\221\22\0\2\221\2\0\2\221\1\0\1\221"+
    "\1\0\11\221\1\222\4\221\1\222\7\221\22\0\2\221"+
    "\2\0\2\221\1\0\1\221\1\0\10\221\1\224\15\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\225\1\0\26\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\221\1\0\6\221"+
    "\1\226\17\221\22\0\2\221\2\0\2\221\1\0\1\221"+
    "\1\0\11\221\1\227\14\221\22\0\2\221\2\0\2\221"+
    "\1\0\1\221\1\0\10\221\1\222\15\221\22\0\2\221"+
    "\2\0\2\221\1\0\1\221\1\0\6\221\1\230\17\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\231\1\0\26\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\221\1\0\5\221"+
    "\1\232\20\221\22\0\2\221\2\0\2\221\1\0\1\221"+
    "\1\0\7\221\1\222\16\221\22\0\2\221\2\0\2\221"+
    "\1\0\1\221\1\0\14\221\1\233\11\221\22\0\2\221"+
    "\2\0\2\221\1\0\1\221\1\0\2\221\1\222\23\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\221\1\0\6\221"+
    "\1\234\17\221\22\0\2\221\2\0\2\221\1\0\1\221"+
    "\1\0\2\221\1\235\23\221\22\0\2\221\2\0\2\221"+
    "\1\0\1\221\1\0\7\221\1\236\16\221\22\0\2\221"+
    "\2\0\2\221\1\0\1\221\1\0\12\221\1\237\13\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\221\1\0\15\221"+
    "\1\222\10\221\22\0\2\221\2\0\2\221\1\0\1\221"+
    "\1\0\11\221\1\237\14\221\22\0\2\221\2\0\2\221"+
    "\1\0\1\221\1\0\14\221\1\237\11\221\22\0\2\221"+
    "\2\0\2\221\1\0\1\221\1\0\17\221\1\240\6\221"+
    "\22\0\2\221\2\0\2\221\1\0\1\221\1\0\13\221"+
    "\1\241\12\221\22\0\2\221\2\0\2\221\1\0\1\221"+
    "\1\0\6\221\1\231\17\221\22\0\2\221\2\0\2\221"+
    "\1\0\1\221\1\0\23\221\1\242\2\221\22\0\2\221"+
    "\2\0\2\221\1\0\1\221\1\0\5\221\1\243\5\221"+
    "\1\244\12\221\22\0\2\221\42\0\1\132\24\0\1\245"+
    "\1\246\36\0\1\245\15\0\1\215\3\0\1\215\53\0"+
    "\2\217\1\0\1\217\1\0\26\217\22\0\2\217\1\150"+
    "\1\0\2\247\1\0\1\247\1\0\26\247\22\0\2\247"+
    "\2\0\2\247\1\0\1\247\1\0\3\247\1\250\22\247"+
    "\22\0\2\247\2\0\2\247\1\0\1\247\1\0\2\247"+
    "\1\251\23\247\22\0\2\247\2\0\2\247\1\0\1\247"+
    "\1\0\1\247\1\252\24\247\22\0\2\247\2\0\2\247"+
    "\1\0\1\247\1\0\7\247\1\250\16\247\22\0\2\247"+
    "\2\0\2\247\1\0\1\253\1\0\26\247\22\0\2\247"+
    "\2\0\2\247\1\0\1\247\1\0\7\247\1\254\16\247"+
    "\22\0\2\247\2\0\2\247\1\0\1\247\1\0\11\247"+
    "\1\250\14\247\22\0\2\247\2\0\2\247\1\0\1\247"+
    "\1\0\6\247\1\255\17\247\22\0\2\247\2\0\2\247"+
    "\1\0\1\247\1\0\12\247\1\250\13\247\22\0\2\247"+
    "\2\0\2\247\1\0\1\247\1\0\7\247\1\256\16\247"+
    "\22\0\2\247\2\0\2\247\1\0\1\247\1\0\12\247"+
    "\1\257\13\247\22\0\2\247\2\0\2\247\1\0\1\247"+
    "\1\0\12\247\1\260\13\247\22\0\2\247\2\0\2\247"+
    "\1\0\1\250\1\0\26\247\22\0\2\247\2\0\2\247"+
    "\1\0\1\247\1\0\1\247\1\261\24\247\22\0\2\247"+
    "\2\0\2\247\1\0\1\247\1\0\12\247\1\262\13\247"+
    "\22\0\2\247\2\0\2\247\1\0\1\251\1\0\26\247"+
    "\22\0\2\247\2\0\2\247\1\0\1\247\1\0\2\247"+
    "\1\263\23\247\22\0\2\247\2\0\2\247\1\0\1\264"+
    "\1\0\26\247\22\0\2\247\7\0\1\246\53\0\2\265"+
    "\1\0\1\265\1\0\26\265\22\0\2\265\2\0\2\265"+
    "\1\0\1\265\1\0\16\265\1\266\7\265\22\0\2\265"+
    "\2\0\2\265\1\0\1\265\1\0\12\265\1\266\13\265"+
    "\22\0\2\265\2\0\2\265\1\0\1\265\1\0\1\265"+
    "\1\267\24\265\22\0\2\265\2\0\2\265\1\0\1\266"+
    "\1\0\26\265\22\0\2\265\2\0\2\265\1\0\1\265"+
    "\1\0\7\265\1\270\16\265\22\0\2\265\2\0\2\265"+
    "\1\0\1\265\1\0\5\265\1\266\20\265\22\0\2\265"+
    "\2\0\2\265\1\0\1\265\1\0\6\265\1\271\17\265"+
    "\22\0\2\265\2\0\2\265\1\0\1\265\1\0\10\265"+
    "\1\266\15\265\22\0\2\265\2\0\2\265\1\0\1\265"+
    "\1\0\2\265\1\272\23\265\22\0\2\265\2\0\2\265"+
    "\1\0\1\265\1\0\6\265\1\273\17\265\22\0\2\265"+
    "\2\0\2\265\1\0\1\265\1\0\1\265\1\274\24\265"+
    "\22\0\2\265\2\0\2\265\1\0\1\265\1\0\16\265"+
    "\1\275\7\265\22\0\2\265\2\0\2\276\1\0\1\276"+
    "\1\0\26\276\22\0\2\276\2\0\2\276\1\0\1\276"+
    "\1\0\7\276\1\277\16\276\22\0\2\276\2\0\2\276"+
    "\1\0\1\276\1\0\12\276\1\277\13\276\22\0\2\276"+
    "\2\0\2\276\1\0\1\276\1\0\7\276\1\300\16\276"+
    "\22\0\2\276\2\0\2\276\1\0\1\276\1\0\16\276"+
    "\1\277\7\276\22\0\2\276\2\0\2\276\1\0\1\276"+
    "\1\0\10\276\1\301\15\276\22\0\2\276\2\0\2\276"+
    "\1\0\1\276\1\0\24\276\1\277\1\276\22\0\2\276"+
    "\2\0\2\276\1\0\1\276\1\0\21\276\1\302\4\276"+
    "\22\0\2\276\2\0\2\303\1\0\1\303\1\0\26\303"+
    "\22\0\2\303\2\0\2\303\1\0\1\303\1\0\12\303"+
    "\1\304\13\303\22\0\2\303\2\0\2\303\1\0\1\303"+
    "\1\0\7\303\1\304\16\303\22\0\2\303\2\0\2\303"+
    "\1\0\1\303\1\0\2\303\1\305\23\303\22\0\2\303"+
    "\2\0\2\306\1\0\1\306\1\0\26\306\22\0\2\306"+
    "\2\0\2\306\1\0\1\307\1\0\26\306\22\0\2\306"+
    "\2\0\2\310\1\0\1\310\1\0\26\310\22\0\2\310"+
    "\2\0\2\311\1\0\1\311\1\0\26\311\22\0\2\311"+
    "\2\0\2\312\1\0\1\312\1\0\26\312\22\0\2\312"+
    "\2\0\2\313\1\0\1\313\1\0\26\313\22\0\2\313"+
    "\2\0\2\314\1\0\1\314\1\0\26\314\22\0\2\314"+
    "\2\0\2\315\1\0\1\315\1\0\26\315\22\0\2\315"+
    "\2\0\2\316\1\0\1\316\1\0\26\316\22\0\2\316"+
    "\2\0\2\317\1\0\1\317\1\0\26\317\22\0\2\317"+
    "\2\0\2\320\1\0\1\320\1\0\26\320\22\0\2\320"+
    "\2\0\2\321\1\0\1\321\1\0\26\321\22\0\2\321"+
    "\2\0\2\322\1\0\1\322\1\0\26\322\22\0\2\322"+
    "\2\0\2\323\1\0\1\323\1\0\26\323\22\0\2\323"+
    "\2\0\2\324\1\0\1\324\1\0\26\324\22\0\2\324"+
    "\2\0\2\325\1\0\1\325\1\0\26\325\22\0\2\325"+
    "\2\0\2\326\1\0\1\326\1\0\26\326\22\0\2\326"+
    "\2\0\2\327\1\0\1\327\1\0\26\327\22\0\2\327"+
    "\2\0\2\330\1\0\1\330\1\0\26\330\22\0\2\330"+
    "\2\0\2\331\1\0\1\331\1\0\26\331\22\0\2\331"+
    "\2\0\2\332\1\0\1\332\1\0\26\332\22\0\2\332"+
    "\2\0\2\333\1\0\1\333\1\0\26\333\22\0\2\333"+
    "\2\0\2\334\1\0\1\334\1\0\26\334\22\0\2\334"+
    "\2\0\2\335\1\0\1\335\1\0\26\335\22\0\2\335"+
    "\2\0\2\336\1\0\1\336\1\0\26\336\22\0\2\336"+
    "\2\0\2\337\1\0\1\337\1\0\26\337\22\0\2\337"+
    "\2\0\2\340\1\0\1\340\1\0\26\340\22\0\2\340"+
    "\2\0\2\341\1\0\1\341\1\0\26\341\22\0\2\341"+
    "\2\0\2\342\1\0\1\342\1\0\26\342\22\0\2\342"+
    "\2\0\2\343\1\0\1\343\1\0\26\343\22\0\2\343"+
    "\2\0\2\344\1\0\1\344\1\0\26\344\22\0\2\344"+
    "\2\0\2\345\1\0\1\345\1\0\26\345\22\0\2\345"+
    "\2\0\2\346\1\0\1\346\1\0\26\346\22\0\2\346"+
    "\2\0\2\347\1\0\1\347\1\0\26\347\22\0\2\347"+
    "\2\0\2\350\1\0\1\350\1\0\26\350\22\0\2\350"+
    "\2\0\2\351\1\0\1\351\1\0\26\351\22\0\2\351"+
    "\2\0\2\352\1\0\1\352\1\0\26\352\22\0\2\352"+
    "\2\0\2\353\1\0\1\353\1\0\26\353\22\0\2\353"+
    "\2\0\2\354\1\0\1\354\1\0\26\354\22\0\2\354"+
    "\2\0\2\355\1\0\1\355\1\0\26\355\22\0\2\355"+
    "\2\0\2\356\1\0\1\356\1\0\26\356\22\0\2\356"+
    "\2\0\2\357\1\0\1\357\1\0\26\357\22\0\2\357"+
    "\2\0\2\360\1\0\1\360\1\0\26\360\22\0\2\360"+
    "\2\0\2\361\1\0\1\361\1\0\26\361\22\0\2\361"+
    "\2\0\2\362\1\0\1\362\1\0\26\362\22\0\2\362"+
    "\2\0\2\363\1\0\1\363\1\0\26\363\22\0\2\363"+
    "\2\0\2\364\1\0\1\364\1\0\26\364\22\0\2\364"+
    "\2\0\2\365\1\0\1\365\1\0\26\365\22\0\2\365"+
    "\2\0\2\366\1\0\1\366\1\0\26\366\22\0\2\366"+
    "\2\0\2\367\1\0\1\367\1\0\26\367\22\0\2\367"+
    "\2\0\2\370\1\0\1\370\1\0\26\370\22\0\2\370"+
    "\2\0\2\371\1\0\1\371\1\0\26\371\22\0\2\371"+
    "\2\0\2\372\1\0\1\372\1\0\26\372\22\0\2\372"+
    "\2\0\2\373\1\0\1\373\1\0\26\373\22\0\2\373"+
    "\2\0\2\374\1\0\1\374\1\0\26\374\22\0\2\374"+
    "\2\0\2\375\1\0\1\375\1\0\26\375\22\0\2\375"+
    "\2\0\2\376\1\0\1\376\1\0\26\376\22\0\2\376"+
    "\2\0\2\377\1\0\1\377\1\0\26\377\22\0\2\377"+
    "\2\0\2\u0100\1\0\1\u0100\1\0\26\u0100\22\0\2\u0100"+
    "\2\0\2\u0101\1\0\1\u0101\1\0\26\u0101\22\0\2\u0101"+
    "\2\0\2\u0102\1\0\1\u0102\1\0\26\u0102\22\0\2\u0102"+
    "\2\0\2\u0103\1\0\1\u0103\1\0\26\u0103\22\0\2\u0103"+
    "\2\0\2\u0104\1\0\1\u0104\1\0\26\u0104\22\0\2\u0104"+
    "\2\0\2\u0105\1\0\1\u0105\1\0\26\u0105\22\0\2\u0105"+
    "\2\0\2\u0106\1\0\1\u0106\1\0\26\u0106\22\0\2\u0106"+
    "\2\0\2\u0107\1\0\1\u0107\1\0\26\u0107\22\0\2\u0107"+
    "\2\0\2\u0108\1\0\1\u0108\1\0\26\u0108\22\0\2\u0108"+
    "\2\0\2\u0109\1\0\1\u0109\1\0\26\u0109\22\0\2\u0109"+
    "\2\0\2\u010a\1\0\1\u010a\1\0\26\u010a\22\0\2\u010a"+
    "\2\0\2\u010b\1\0\1\u010b\1\0\26\u010b\22\0\2\u010b"+
    "\2\0\2\u010c\1\0\1\u010c\1\0\26\u010c\22\0\2\u010c"+
    "\2\0\2\u010d\1\0\1\u010d\1\0\26\u010d\22\0\2\u010d"+
    "\2\0\2\u010e\1\0\1\u010e\1\0\26\u010e\22\0\2\u010e"+
    "\2\0\2\u010f\1\0\1\u010f\1\0\26\u010f\22\0\2\u010f"+
    "\2\0\2\u0110\1\0\1\u0110\1\0\26\u0110\22\0\2\u0110"+
    "\2\0\2\u0111\1\0\1\u0111\1\0\26\u0111\22\0\2\u0111"+
    "\2\0\2\u0112\1\0\1\u0112\1\0\26\u0112\22\0\2\u0112"+
    "\2\0\2\u0113\1\0\1\u0113\1\0\26\u0113\22\0\2\u0113"+
    "\2\0\2\u0114\1\0\1\u0114\1\0\26\u0114\22\0\2\u0114"+
    "\2\0\2\u0115\1\0\1\u0115\1\0\26\u0115\22\0\2\u0115"+
    "\2\0\2\u0116\1\0\1\u0116\1\0\26\u0116\22\0\2\u0116"+
    "\2\0\2\u0117\1\0\1\u0117\1\0\26\u0117\22\0\2\u0117"+
    "\2\0\2\u0118\1\0\1\u0118\1\0\26\u0118\22\0\2\u0118"+
    "\2\0\2\u0119\1\0\1\u0119\1\0\26\u0119\22\0\2\u0119"+
    "\2\0\2\u011a\1\0\1\u011a\1\0\26\u011a\22\0\2\u011a"+
    "\2\0\2\u011b\1\0\1\u011b\1\0\26\u011b\22\0\2\u011b"+
    "\2\0\2\u011c\1\0\1\u011c\1\0\26\u011c\22\0\2\u011c"+
    "\2\0\2\u011d\1\0\1\u011d\1\0\26\u011d\22\0\2\u011d"+
    "\2\0\2\u011e\1\0\1\u011e\1\0\26\u011e\22\0\2\u011e"+
    "\2\0\2\u011f\1\0\1\u011f\1\0\26\u011f\22\0\2\u011f"+
    "\2\0\2\u0120\1\0\1\u0120\1\0\26\u0120\22\0\2\u0120"+
    "\2\0\2\u0121\1\0\1\u0121\1\0\26\u0121\22\0\2\u0121"+
    "\2\0\2\u0122\1\0\1\u0122\1\0\26\u0122\22\0\2\u0122"+
    "\2\0\2\u0123\1\0\1\u0123\1\0\26\u0123\22\0\2\u0123"+
    "\2\0\2\u0124\1\0\1\u0124\1\0\26\u0124\22\0\2\u0124"+
    "\2\0\2\u0125\1\0\1\u0125\1\0\26\u0125\22\0\2\u0125"+
    "\2\0\2\u0126\1\0\1\u0126\1\0\26\u0126\22\0\2\u0126"+
    "\2\0\2\u0127\1\0\1\u0127\1\0\26\u0127\22\0\2\u0127"+
    "\2\0\2\u0128\1\0\1\u0128\1\0\26\u0128\22\0\2\u0128"+
    "\2\0\2\u0129\1\0\1\u0129\1\0\26\u0129\22\0\2\u0129"+
    "\2\0\2\u012a\1\0\1\u012a\1\0\26\u012a\22\0\2\u012a"+
    "\2\0\2\u012b\1\0\1\u012b\1\0\26\u012b\22\0\2\u012b"+
    "\2\0\2\u012c\1\0\1\u012c\1\0\26\u012c\22\0\2\u012c"+
    "\2\0\2\u012d\1\0\1\u012d\1\0\26\u012d\22\0\2\u012d"+
    "\2\0\2\u012e\1\0\1\u012e\1\0\26\u012e\22\0\2\u012e"+
    "\2\0\2\u012f\1\0\1\u012f\1\0\26\u012f\22\0\2\u012f"+
    "\2\0\2\u0130\1\0\1\u0130\1\0\26\u0130\22\0\2\u0130"+
    "\2\0\2\u0131\1\0\1\u0131\1\0\26\u0131\22\0\2\u0131"+
    "\2\0\2\u0132\1\0\1\u0132\1\0\26\u0132\22\0\2\u0132"+
    "\2\0\2\u0133\1\0\1\u0133\1\0\26\u0133\22\0\2\u0133"+
    "\2\0\2\u0134\1\0\1\u0134\1\0\26\u0134\22\0\2\u0134"+
    "\2\0\2\u0135\1\0\1\u0135\1\0\26\u0135\22\0\2\u0135"+
    "\2\0\2\u0136\1\0\1\u0136\1\0\26\u0136\22\0\2\u0136"+
    "\2\0\2\u0137\1\0\1\u0137\1\0\26\u0137\22\0\2\u0137"+
    "\2\0\2\u0138\1\0\1\u0138\1\0\26\u0138\22\0\2\u0138"+
    "\2\0\2\u0139\1\0\1\u0139\1\0\26\u0139\22\0\2\u0139"+
    "\2\0\2\u013a\1\0\1\u013a\1\0\26\u013a\22\0\2\u013a"+
    "\2\0\2\u013b\1\0\1\u013b\1\0\26\u013b\22\0\2\u013b"+
    "\2\0\2\u013c\1\0\1\u013c\1\0\26\u013c\22\0\2\u013c"+
    "\2\0\2\u013d\1\0\1\u013d\1\0\26\u013d\22\0\2\u013d"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13622];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\33\1\3\11\3\1\4\11\4\1\1\0"+
    "\3\1\2\11\44\1\1\0\1\11\2\0\5\11\1\1"+
    "\2\11\1\1\1\11\3\1\1\0\1\11\40\1\1\0"+
    "\2\11\1\0\2\1\1\0\1\11\24\1\1\0\1\11"+
    "\226\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[317];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return OperadorPunto;
          }
        case 44: break;
        case 13: 
          { return OperadorMenorQue;
          }
        case 45: break;
        case 1: 
          { return Error;
          }
        case 46: break;
        case 23: 
          { return OperadorOr;
          }
        case 47: break;
        case 5: 
          { return OperadorResta;
          }
        case 48: break;
        case 33: 
          { return OperadorAsignacion;
          }
        case 49: break;
        case 35: 
          { lexeme=yytext(); return String;
          }
        case 50: break;
        case 24: 
          { return OperadorDivisionAsignacion;
          }
        case 51: break;
        case 8: 
          { return OperadorIgual;
          }
        case 52: break;
        case 14: 
          { return OperadorParentesisIzquierdo;
          }
        case 53: break;
        case 29: 
          { return OperadorDesplazamientoDerecha;
          }
        case 54: break;
        case 34: 
          { lexeme=yytext(); return Flotante;
          }
        case 55: break;
        case 17: 
          { return OperadorCorcheteDerecho;
          }
        case 56: break;
        case 22: 
          { lexeme=yytext(); return PalabraReservada;
          }
        case 57: break;
        case 31: 
          { return OperadorDiferente;
          }
        case 58: break;
        case 18: 
          { return OperadorDosPuntos;
          }
        case 59: break;
        case 41: 
          { return OperadorDesplazamientoIzquierdaAsignacion;
          }
        case 60: break;
        case 28: 
          { return OperadorMayorOIgualQue;
          }
        case 61: break;
        case 4: 
          { return Identificador;
          }
        case 62: break;
        case 26: 
          { return OperadorSumaAsignacion;
          }
        case 63: break;
        case 20: 
          { return OperadorDecremento;
          }
        case 64: break;
        case 42: 
          { return OperadorXor;
          }
        case 65: break;
        case 27: 
          { return OperadorIncremento;
          }
        case 66: break;
        case 39: 
          { return OperadorMod;
          }
        case 67: break;
        case 12: 
          { return OperadorMayorQue;
          }
        case 68: break;
        case 7: 
          { return OperadorMultiplicacion;
          }
        case 69: break;
        case 6: 
          { return OperadorDivision;
          }
        case 70: break;
        case 30: 
          { return OperadorMenorOIgualQue;
          }
        case 71: break;
        case 32: 
          { return OperadorDesplazamientoIzquierda;
          }
        case 72: break;
        case 15: 
          { return OperadorParentesisDerecho;
          }
        case 73: break;
        case 38: 
          { return OperadorDiv;
          }
        case 74: break;
        case 2: 
          { lexeme=yytext(); return Entero;
          }
        case 75: break;
        case 43: 
          { lexeme=yytext(); return Caracter;
          }
        case 76: break;
        case 10: 
          { return OperadorPuntoYComa;
          }
        case 77: break;
        case 9: 
          { return OperadorComa;
          }
        case 78: break;
        case 25: 
          { return OperadorMultiplicacionAsignacion;
          }
        case 79: break;
        case 37: 
          { return OperadorNot;
          }
        case 80: break;
        case 36: 
          { return OperadorAnd;
          }
        case 81: break;
        case 3: 
          { /*Ignore*/
          }
        case 82: break;
        case 16: 
          { return OperadorCorcheteIzquierdo;
          }
        case 83: break;
        case 21: 
          { return OperadorRestaAsignacion;
          }
        case 84: break;
        case 40: 
          { return OperadorDesplazamientoDerechaAsignacion;
          }
        case 85: break;
        case 11: 
          { return OperadorSuma;
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
