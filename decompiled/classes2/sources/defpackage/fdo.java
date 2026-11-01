package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fdo extends defpackage.ewz {
    private defpackage.fdn A;
    private int B;
    private boolean C;
    private final defpackage.oq D;
    private rai E;
    private final defpackage.ewu k;
    private final java.util.ArrayDeque l;
    private boolean m;
    private boolean n;
    private defpackage.fdm o;
    private long p;
    private long q;
    private int r;
    private int s;
    private defpackage.eqg t;
    private defpackage.fdi u;
    private defpackage.ewu v;
    private androidx.media3.exoplayer.image.ImageOutput w;
    private android.graphics.Bitmap x;
    private boolean y;
    private defpackage.fdn z;

    public fdo(defpackage.oq oqVar) {
        super(4);
        this.D = oqVar;
        this.w = Z(null);
        this.k = new defpackage.ewu(0);
        this.o = defpackage.fdm.a;
        this.l = new java.util.ArrayDeque();
        this.q = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.r = 0;
        this.s = 1;
    }

    private static androidx.media3.exoplayer.image.ImageOutput Z(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        return imageOutput == null ? androidx.media3.exoplayer.image.ImageOutput.a : imageOutput;
    }

    private final void aa() {
        this.v = null;
        this.r = 0;
        this.q = -9223372036854775807L;
        defpackage.fdi fdiVar = this.u;
        if (fdiVar != null) {
            fdiVar.e();
            this.u = null;
        }
    }

    private final void ab() {
        this.s = java.lang.Math.min(this.s, 1);
    }

    private final void ac() throws defpackage.exl {
        if (this.C) {
            defpackage.eqg eqgVar = this.t;
            ahvr.ci(eqgVar);
            defpackage.oq oqVar = this.D;
            int iK = defpackage.oq.k(eqgVar);
            if (iK != 132 && iK != 131) {
                throw h(new defpackage.fdj(), this.t, false, 4005);
            }
            defpackage.fdi fdiVar = this.u;
            if (fdiVar != null) {
                fdiVar.e();
            }
            this.u = new defpackage.fdh((android.content.Context) oqVar.a);
            this.C = false;
        }
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final java.lang.String U() {
        return "ImageRenderer";
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cf A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d2 A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01e5 A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x0207  */
    /* JADX WARN: Code duplicated, block: B:120:0x0216 A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x022c A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x023d A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0240 A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x024c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0142 A[EDGE_INSN: B:146:0x0142->B:163:? BREAK  A[LOOP:0: B:17:0x0046->B:66:0x0134], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x025d A[EDGE_INSN: B:149:0x025d->B:132:0x025d BREAK  A[LOOP:1: B:68:0x0142->B:160:0x0142], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x025d A[EDGE_INSN: B:157:0x025d->B:132:0x025d BREAK  A[LOOP:1: B:68:0x0142->B:160:0x0142], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0168 A[Catch: fdj -> 0x0261, PHI: r10
      0x0168: PHI (r10v11 ewu) = (r10v10 ewu), (r10v17 ewu) binds: [B:79:0x015c, B:81:0x0166] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0183 A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x018b A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x019c A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac A[Catch: fdj -> 0x0261, TryCatch #0 {fdj -> 0x0261, blocks: (B:16:0x0041, B:17:0x0046, B:19:0x004b, B:68:0x0142, B:70:0x0146, B:132:0x025d, B:72:0x014a, B:74:0x0152, B:76:0x0156, B:78:0x015a, B:80:0x015e, B:82:0x0168, B:84:0x016c, B:85:0x0183, B:88:0x018b, B:90:0x0196, B:97:0x01ac, B:98:0x01c4, B:100:0x01cf, B:121:0x021c, B:123:0x0227, B:124:0x022c, B:126:0x023d, B:128:0x0248, B:127:0x0240, B:101:0x01d2, B:103:0x01e5, B:105:0x01ee, B:109:0x01f7, B:111:0x01fb, B:117:0x0208, B:120:0x0216, B:92:0x019c, B:131:0x024e, B:21:0x004f, B:23:0x0053, B:26:0x0059, B:28:0x0066, B:30:0x006c, B:32:0x0070, B:33:0x007d, B:35:0x0088, B:36:0x008c, B:37:0x009a, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:45:0x00b5, B:46:0x00bc, B:50:0x00d5, B:51:0x00da, B:55:0x00e1, B:57:0x00e5, B:59:0x00f7, B:60:0x0104, B:61:0x0117, B:63:0x011f, B:65:0x012b, B:66:0x0134), top: B:137:0x0041 }] */
    @Override // defpackage.ezf
    public final void V(long j, long j2) throws defpackage.exl {
        long j3;
        int iS;
        java.nio.ByteBuffer byteBuffer;
        defpackage.ewu ewuVar;
        boolean z;
        defpackage.ewu ewuVar2;
        defpackage.fdn fdnVar;
        long j4;
        boolean z2;
        defpackage.fdn fdnVar2;
        boolean z3;
        defpackage.ewu ewuVar3;
        if (this.n) {
            return;
        }
        if (this.t == null) {
            defpackage.hiz hizVarT = T();
            defpackage.ewu ewuVar4 = this.k;
            ewuVar4.dJ();
            int iS2 = S(hizVarT, ewuVar4, 2);
            if (iS2 != -5) {
                if (iS2 == -4) {
                    ahvr.bY(ewuVar4.dL(4));
                    this.m = true;
                    this.n = true;
                    return;
                }
                return;
            }
            java.lang.Object obj = hizVarT.a;
            ahvr.ci(obj);
            this.t = (defpackage.eqg) obj;
            this.C = true;
        }
        if (this.u == null) {
            ac();
        }
        try {
            android.os.Trace.beginSection("drainAndFeedDecoder");
            while (true) {
                android.graphics.Bitmap bitmap = this.x;
                if ((bitmap == null || this.z != null) && (this.s != 0 || this.b == 2)) {
                    if (bitmap == null) {
                        ahvr.ci(this.u);
                        defpackage.fdl fdlVarP = this.u.p();
                        if (fdlVarP != null) {
                            if (!fdlVarP.dL(4)) {
                                ahvr.cj(fdlVarP.e, "Non-EOS buffer came back from the decoder without bitmap.");
                                this.x = fdlVarP.e;
                                fdlVarP.d();
                                if (!this.y && this.x != null && this.z != null) {
                                    ahvr.ci(this.t);
                                    int i = this.t.P;
                                    defpackage.fdn fdnVar3 = this.z;
                                    if (fdnVar3.c == null) {
                                        android.graphics.Bitmap bitmap2 = this.x;
                                        ahvr.ci(bitmap2);
                                        fdnVar3.c = bitmap2;
                                    }
                                    android.graphics.Bitmap bitmap3 = this.z.c;
                                    ahvr.ci(bitmap3);
                                    long j5 = this.z.b;
                                    long j6 = j5 - j;
                                    j3 = 30000;
                                    int i2 = this.b;
                                    int i3 = this.s;
                                    if (i3 == 0) {
                                        if (i2 != 2) {
                                            if (j6 >= 30000) {
                                                break;
                                                break;
                                            }
                                        }
                                    } else if (i3 != 1) {
                                        if (i3 != 3) {
                                            throw new java.lang.IllegalStateException();
                                        }
                                        if (j6 >= 30000) {
                                            break;
                                        }
                                    }
                                    rai raiVar = this.E;
                                    if (raiVar != null) {
                                        long j7 = this.o.c;
                                        ahvr.ci(this.t);
                                        java.lang.Object obj2 = raiVar.a;
                                        if (((defpackage.eyj) obj2).m) {
                                            ((defpackage.eyj) obj2).f.h(37).b();
                                        }
                                    }
                                    this.w.onImageAvailable(j5 - this.o.c, bitmap3);
                                    defpackage.fdn fdnVar4 = this.z;
                                    ahvr.ci(fdnVar4);
                                    long j8 = fdnVar4.b;
                                    this.p = j8;
                                    while (true) {
                                        java.util.ArrayDeque arrayDeque = this.l;
                                        if (arrayDeque.isEmpty() || j8 < ((defpackage.fdm) arrayDeque.peek()).b) {
                                            break;
                                        } else {
                                            this.o = (defpackage.fdm) arrayDeque.removeFirst();
                                        }
                                    }
                                    this.s = 3;
                                    this.x = null;
                                    this.z = this.A;
                                    this.A = null;
                                }
                            } else if (this.r == 3) {
                                aa();
                                ahvr.ci(this.t);
                                ac();
                            } else {
                                fdlVarP.d();
                                if (this.l.isEmpty()) {
                                    this.n = true;
                                }
                            }
                        }
                    } else if (!this.y) {
                    }
                }
                j3 = 30000;
                break;
            }
            while (true) {
                if (this.y && this.z != null) {
                    break;
                }
                defpackage.hiz hizVarT2 = T();
                defpackage.ewr ewrVar = this.u;
                if (ewrVar == null || this.r == 3 || this.m) {
                    break;
                }
                defpackage.ewu ewuVarA = this.v;
                if (ewuVarA == null) {
                    ewuVarA = ((defpackage.ewx) ewrVar).a();
                    this.v = ewuVarA;
                    if (ewuVarA == null) {
                        break;
                    }
                    if (this.r == 2) {
                        ahvr.ci(ewuVarA);
                        this.v.a = 4;
                        defpackage.fdi fdiVar = this.u;
                        ahvr.ci(fdiVar);
                        fdiVar.m(this.v);
                        this.v = null;
                        this.r = 3;
                        break;
                    }
                    iS = S(hizVarT2, ewuVarA, 0);
                    if (iS != -5) {
                        java.lang.Object obj3 = hizVarT2.a;
                        ahvr.ci(obj3);
                        this.t = (defpackage.eqg) obj3;
                        this.C = true;
                        this.r = 2;
                    } else {
                        if (iS == -4) {
                            break;
                        }
                        this.v.e();
                        byteBuffer = this.v.d;
                        if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                            ewuVar = this.v;
                            ahvr.ci(ewuVar);
                            if (ewuVar.dL(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                            defpackage.ewu ewuVar5 = this.v;
                            ahvr.ci(ewuVar5);
                            ewuVar5.b = this.t;
                            defpackage.fdi fdiVar2 = this.u;
                            ahvr.ci(fdiVar2);
                            defpackage.ewu ewuVar6 = this.v;
                            ahvr.ci(ewuVar6);
                            fdiVar2.m(ewuVar6);
                            this.B = 0;
                        }
                        ewuVar2 = this.v;
                        ahvr.ci(ewuVar2);
                        if (ewuVar2.dL(4)) {
                            this.y = true;
                        } else {
                            int i4 = this.B;
                            fdnVar = new defpackage.fdn(i4, ewuVar2.f);
                            this.A = fdnVar;
                            this.B = i4 + 1;
                            if (this.y) {
                                this.z = this.A;
                                this.A = null;
                            } else {
                                j4 = fdnVar.b;
                                if ((-30000) + j4 <= j || j > j4 + j3) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                fdnVar2 = this.z;
                                if (fdnVar2 != null || fdnVar2.b > j || j >= j4) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                ahvr.ci(fdnVar);
                                ahvr.ci(this.t);
                                this.y = true;
                                if (z3 || z2) {
                                    this.z = this.A;
                                    this.A = null;
                                }
                            }
                        }
                        ewuVar3 = this.v;
                        ahvr.ci(ewuVar3);
                        if (ewuVar3.dL(4)) {
                            long j9 = this.q;
                            defpackage.ewu ewuVar7 = this.v;
                            ahvr.ci(ewuVar7);
                            this.q = java.lang.Math.max(j9, ewuVar7.f);
                            if (z) {
                                this.v = null;
                            } else {
                                defpackage.ewu ewuVar8 = this.v;
                                ahvr.ci(ewuVar8);
                                ewuVar8.dJ();
                            }
                            if (!this.y) {
                                break;
                            }
                        } else {
                            this.m = true;
                            this.v = null;
                            break;
                        }
                    }
                } else {
                    if (this.r == 2) {
                        ahvr.ci(ewuVarA);
                        this.v.a = 4;
                        defpackage.fdi fdiVar3 = this.u;
                        ahvr.ci(fdiVar3);
                        fdiVar3.m(this.v);
                        this.v = null;
                        this.r = 3;
                        break;
                    }
                    iS = S(hizVarT2, ewuVarA, 0);
                    if (iS != -5) {
                        java.lang.Object obj4 = hizVarT2.a;
                        ahvr.ci(obj4);
                        this.t = (defpackage.eqg) obj4;
                        this.C = true;
                        this.r = 2;
                    } else {
                        if (iS == -4) {
                            break;
                            break;
                        }
                        this.v.e();
                        byteBuffer = this.v.d;
                        if (byteBuffer != null) {
                            ewuVar = this.v;
                            ahvr.ci(ewuVar);
                            if (ewuVar.dL(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            ewuVar = this.v;
                            ahvr.ci(ewuVar);
                            if (ewuVar.dL(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            defpackage.ewu ewuVar9 = this.v;
                            ahvr.ci(ewuVar9);
                            ewuVar9.b = this.t;
                            defpackage.fdi fdiVar4 = this.u;
                            ahvr.ci(fdiVar4);
                            defpackage.ewu ewuVar10 = this.v;
                            ahvr.ci(ewuVar10);
                            fdiVar4.m(ewuVar10);
                            this.B = 0;
                        }
                        ewuVar2 = this.v;
                        ahvr.ci(ewuVar2);
                        if (ewuVar2.dL(4)) {
                            this.y = true;
                        } else {
                            int i5 = this.B;
                            fdnVar = new defpackage.fdn(i5, ewuVar2.f);
                            this.A = fdnVar;
                            this.B = i5 + 1;
                            if (this.y) {
                                j4 = fdnVar.b;
                                if ((-30000) + j4 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                fdnVar2 = this.z;
                                if (fdnVar2 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                ahvr.ci(fdnVar);
                                ahvr.ci(this.t);
                                this.y = true;
                                if (z3) {
                                    this.z = this.A;
                                    this.A = null;
                                } else {
                                    this.z = this.A;
                                    this.A = null;
                                }
                            } else {
                                this.z = this.A;
                                this.A = null;
                            }
                        }
                        ewuVar3 = this.v;
                        ahvr.ci(ewuVar3);
                        if (ewuVar3.dL(4)) {
                            long j10 = this.q;
                            defpackage.ewu ewuVar11 = this.v;
                            ahvr.ci(ewuVar11);
                            this.q = java.lang.Math.max(j10, ewuVar11.f);
                            if (z) {
                                this.v = null;
                            } else {
                                defpackage.ewu ewuVar12 = this.v;
                                ahvr.ci(ewuVar12);
                                ewuVar12.dJ();
                            }
                            if (!this.y) {
                                break;
                                break;
                            }
                        } else {
                            this.m = true;
                            this.v = null;
                            break;
                        }
                    }
                }
            }
            android.os.Trace.endSection();
        } catch (defpackage.fdj e) {
            throw h(e, null, false, 4003);
        }
    }

    @Override // defpackage.ezf
    public final boolean W() {
        return this.n;
    }

    @Override // defpackage.ezf
    public final boolean X() {
        int i = this.s;
        if (i != 3) {
            return i == 0 && this.y;
        }
        return true;
    }

    @Override // defpackage.ezg
    public final int Y(defpackage.eqg eqgVar) {
        return defpackage.oq.k(eqgVar);
    }

    @Override // defpackage.ewz, defpackage.ezc
    public final void p(int i, java.lang.Object obj) {
        if (i == 15) {
            this.w = Z(obj instanceof androidx.media3.exoplayer.image.ImageOutput ? (androidx.media3.exoplayer.image.ImageOutput) obj : null);
        } else if (i == 23) {
            this.E = (rai) obj;
        }
    }

    @Override // defpackage.ewz
    protected final void s() {
        this.t = null;
        this.o = defpackage.fdm.a;
        this.l.clear();
        aa();
        this.w.a();
    }

    @Override // defpackage.ewz
    protected final void t(boolean z, boolean z2) {
        this.s = z2 ? 1 : 0;
    }

    @Override // defpackage.ewz
    protected final void u(long j, boolean z, boolean z2) {
        ab();
        this.n = false;
        this.m = false;
        this.x = null;
        this.z = null;
        this.A = null;
        this.y = false;
        this.v = null;
        defpackage.fdi fdiVar = this.u;
        if (fdiVar != null) {
            fdiVar.c();
        }
        this.l.clear();
    }

    @Override // defpackage.ewz
    protected final void v() {
        aa();
    }

    @Override // defpackage.ewz
    protected final void w() {
        aa();
        ab();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L13;
     */
    @Override // defpackage.ewz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void z(defpackage.eqg[] r5, long r6, long r8, defpackage.ffu r10) {
        /*
            r4 = this;
            fdm r5 = r4.o
            long r5 = r5.c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L30
            java.util.ArrayDeque r5 = r4.l
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L25
            long r6 = r4.q
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L30
            long r2 = r4.p
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L25
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
        L25:
            fdm r6 = new fdm
            long r0 = r4.q
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L37
        L30:
            fdm r5 = new fdm
            r5.<init>(r0, r8)
            r4.o = r5
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdo.z(eqg[], long, long, ffu):void");
    }
}
