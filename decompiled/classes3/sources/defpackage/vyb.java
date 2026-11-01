package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vyb extends defpackage.ahao {
    private final ahbv a;

    public vyb(ahbv ahbvVar) {
        this.a = ahbvVar;
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ android.view.View a(android.view.ViewGroup viewGroup) {
        return (com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624017, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0448 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x044f A[Catch: all -> 0x0488, TRY_LEAVE, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b4 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01d4 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01eb A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0283 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0305 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0312 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x031f A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0325 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0335 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x033f A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0359 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0361 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0392  */
    /* JADX WARN: Code duplicated, block: B:85:0x0394  */
    /* JADX WARN: Code duplicated, block: B:88:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0407 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x041d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0421  */
    /* JADX WARN: Code duplicated, block: B:96:0x0429 A[Catch: all -> 0x0488, TryCatch #0 {all -> 0x0488, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x001c, B:8:0x0022, B:9:0x0024, B:11:0x0056, B:13:0x0085, B:15:0x008c, B:16:0x008e, B:18:0x00af, B:19:0x00b1, B:21:0x00b9, B:22:0x00bb, B:24:0x00c7, B:26:0x00d0, B:27:0x00dc, B:29:0x00e6, B:31:0x010c, B:32:0x0124, B:34:0x012c, B:41:0x017f, B:43:0x018c, B:45:0x019a, B:46:0x019c, B:48:0x01a6, B:49:0x01a8, B:67:0x031f, B:69:0x0325, B:71:0x0335, B:72:0x0337, B:74:0x033f, B:75:0x0341, B:82:0x0381, B:86:0x0395, B:89:0x03a8, B:91:0x0407, B:95:0x0424, B:101:0x0439, B:103:0x0448, B:104:0x044f, B:96:0x0429, B:100:0x0435, B:76:0x0359, B:78:0x0361, B:80:0x0367, B:51:0x01b4, B:53:0x01ba, B:55:0x01ca, B:56:0x01cc, B:58:0x01d4, B:59:0x01d6, B:61:0x01eb, B:63:0x02ff, B:65:0x0305, B:66:0x0312, B:62:0x0283, B:35:0x014d, B:36:0x015b, B:38:0x0161, B:40:0x0176), top: B:114:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x042e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0432  */
    /* JADX WARN: Type inference failed for: r6v32, types: [android.view.View, com.google.android.material.card.MaterialCardView] */
    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        int i;
        defpackage.vyc vycVar;
        kiu kiuVar;
        nwv nwvVarB;
        int i2;
        j$.util.Optional optional;
        java.lang.Boolean bool;
        int i3;
        ?? r6;
        boolean zC;
        int i4;
        java.lang.String string;
        int i5;
        kiu kiuVar2;
        nwv nwvVarB2;
        com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView = (com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView) view;
        defpackage.vyj vyjVar = (defpackage.vyj) obj;
        defpackage.vyd vydVarY = voicemailEntryView.y();
        ahoq ahoqVarW = ahvr.W(1045, "VoicemailEntryViewPeer_updateView");
        try {
            defpackage.uzo uzoVar = vyjVar.a;
            kiu kiuVar3 = uzoVar.d;
            if (kiuVar3 == null) {
                kiuVar3 = kiu.a;
            }
            long j = kiuVar3.e;
            defpackage.uzn uznVar = uzoVar.c;
            if (uznVar == null) {
                uznVar = defpackage.uzn.a;
            }
            long j2 = uznVar.g;
            android.widget.TextView textView = vydVarY.f;
            textView.setText(vydVarY.r.d(kiuVar3, true));
            android.widget.TextView textView2 = vydVarY.g;
            defpackage.vxz vxzVar = vydVarY.n;
            textView2.setText(vxzVar.a(j, j2));
            android.content.Context context = vxzVar.a;
            aazc aazcVar = vxzVar.b;
            java.lang.CharSequence charSequenceQ = hgu.q(context, j$.time.Instant.now().toEpochMilli(), j);
            if (j2 > 0) {
                int seconds = (int) j$.time.Duration.ofMillis(j2).getSeconds();
                i = 0;
                charSequenceQ = context.getString(2132020832, charSequenceQ, context.getResources().getQuantityString(2131886114, seconds, java.lang.Integer.valueOf(seconds)));
            } else {
                i = 0;
            }
            textView2.setContentDescription(charSequenceQ);
            kiu kiuVar4 = uzoVar.d;
            if (kiuVar4 == null) {
                kiuVar4 = kiu.a;
            }
            vxzVar.c(textView, textView2, kiuVar4.j);
            ops opsVar = vydVarY.p;
            android.widget.QuickContactBadge quickContactBadge = vydVarY.h;
            opsVar.h(quickContactBadge, (defpackage.abwd) vydVarY.q.a(kiuVar3, 1).p(), true);
            android.widget.TextView textView3 = vydVarY.i;
            kiu kiuVar5 = uzoVar.d;
            if (kiuVar5 == null) {
                kiuVar5 = kiu.a;
            }
            kit kitVarB = kit.b(kiuVar5.v);
            if (kitVarB == null) {
                kitVarB = kit.a;
            }
            vxzVar.d(textView3, kitVarB);
            if (defpackage.vyd.c(vyjVar)) {
                j$.util.Optional optionalOfNullable = vydVarY.o;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.vyj) optionalOfNullable.get()).c);
                }
                defpackage.vyi vyiVar = defpackage.vyi.a;
                if (((defpackage.vyi) optionalOfNullable.orElse(vyiVar)) == vyiVar) {
                    aooh.f(uzoVar, "entry");
                    iek iekVarAn = wsc.an(wsc.am(uzoVar));
                    defpackage.vyi vyiVar2 = vyjVar.c;
                    com.android.dialer.audioplayback.impl.ui.AudioPlaybackView audioPlaybackViewA = hgz.a(vydVarY.a, ((defpackage.vyc) vydVarY.m.eZ()).b);
                    hgz.c(audioPlaybackViewA, iekVarAn);
                    if (vyiVar2 == defpackage.vyi.b) {
                        android.view.View viewFindViewById = audioPlaybackViewA.findViewById(2131428697);
                        aooh.e(viewFindViewById, "findViewById(...)");
                        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewFindViewById;
                        imageButton.performAccessibilityAction(64, null);
                        imageButton.sendAccessibilityEvent(8);
                    }
                }
                j$.util.Optional optional2 = vyjVar.e;
                if (optional2.isPresent()) {
                    ahzi ahziVar = vydVarY.m;
                    ((defpackage.vyc) ahziVar.eZ()).i.setText((java.lang.CharSequence) optional2.orElseThrow());
                    ((defpackage.vyc) ahziVar.eZ()).i.setVisibility(i);
                } else {
                    ((defpackage.vyc) vydVarY.m.eZ()).i.setVisibility(8);
                }
            } else if (vydVarY.b()) {
                j$.util.Optional optionalB = hgz.b(((defpackage.vyc) vydVarY.m.eZ()).b);
                if (true == optionalB.isPresent()) {
                    hgz.f((android.view.View) optionalB.get());
                }
            }
            if (vydVarY.o.isPresent()) {
                kiu kiuVar6 = ((defpackage.vyj) vydVarY.o.orElseThrow()).a.d;
                if (kiuVar6 == null) {
                    kiuVar6 = kiu.a;
                }
                java.lang.Long lValueOf = java.lang.Long.valueOf(kiuVar6.d);
                kiu kiuVar7 = uzoVar.d;
                if (kiuVar7 == null) {
                    kiuVar7 = kiu.a;
                }
                if (lValueOf.equals(java.lang.Long.valueOf(kiuVar7.d))) {
                    if (vydVarY.d(vyjVar)) {
                        vycVar = (defpackage.vyc) vydVarY.m.eZ();
                        defpackage.zlr zlrVar = vydVarY.t;
                        android.widget.LinearLayout linearLayout = vycVar.c;
                        kiuVar = uzoVar.d;
                        if (kiuVar == null) {
                            kiuVar = kiu.a;
                        }
                        nwvVarB = nwv.b(uzoVar.f);
                        if (nwvVarB == null) {
                            nwvVarB = nwv.a;
                        }
                        zlrVar.h(linearLayout, kiuVar, nwvVarB);
                        vydVarY.a(uzoVar);
                        if (defpackage.vyd.c(vyjVar)) {
                            android.view.ViewGroup viewGroup = vycVar.a;
                            hhb.b(viewGroup);
                            viewGroup.setVisibility(0);
                            com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView2 = vydVarY.b;
                            hsh hshVar = vydVarY.l;
                            android.view.animation.Interpolator interpolator = defpackage.vxt.a;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) voicemailEntryView2.findViewById(2131428210);
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) voicemailEntryView2.findViewById(2131429465);
                            android.view.View viewFindViewById2 = voicemailEntryView2.findViewById(2131428685);
                            aooh.c(viewGroup2);
                            int iB = defpackage.vxt.b(viewGroup2);
                            viewGroup2.getLayoutParams().height = iB;
                            hshVar.d();
                            hshVar.j(0.33333334f, 0.0f, 1.0f, defpackage.vxt.a, new kkz(frameLayout, 13));
                            hshVar.g(0.0f, iB, defpackage.vxt.d, new kkz(frameLayout, 15));
                            hshVar.g(-defpackage.vxt.c(voicemailEntryView2), 0.0f, defpackage.vxt.c, new kkz(frameLayout, 16));
                            hshVar.j(0.5f, 1.0f, 0.0f, defpackage.vxt.b, new kkz(viewFindViewById2, 17));
                            hshVar.h(new kkz(frameLayout, 18));
                            hshVar.i(new defpackage.wdm(viewGroup2, frameLayout, 1));
                            hshVar.setDuration(defpackage.vxt.a(voicemailEntryView2)).start();
                        } else {
                            com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView3 = vydVarY.b;
                            hsh hshVar2 = vydVarY.l;
                            android.view.animation.Interpolator interpolator2 = defpackage.vxt.a;
                            final android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) voicemailEntryView3.findViewById(2131428210);
                            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) voicemailEntryView3.findViewById(2131429465);
                            final android.view.View viewFindViewById3 = voicemailEntryView3.findViewById(2131428685);
                            aooh.c(viewGroup3);
                            int iB2 = defpackage.vxt.b(viewGroup3);
                            hshVar2.d();
                            hshVar2.j(0.33333334f, 1.0f, 0.0f, defpackage.vxt.a, new kkz(frameLayout2, 19));
                            hshVar2.g(iB2, 0.0f, defpackage.vxt.d, new kkz(frameLayout2, 20));
                            float f = -defpackage.vxt.c(voicemailEntryView3);
                            android.view.animation.Interpolator interpolator3 = defpackage.vxt.c;
                            final int i6 = 1;
                            hshVar2.g(0.0f, f, interpolator3, new hsf() { // from class: vxs
                                public final void a(float f2) {
                                    int i7 = i6;
                                    if (i7 == 0) {
                                        android.view.animation.Interpolator interpolator4 = defpackage.vxt.a;
                                        android.view.View view2 = frameLayout2;
                                        view2.setScaleY(f2);
                                        view2.setScaleX(f2);
                                        return;
                                    }
                                    if (i7 == 1) {
                                        android.view.animation.Interpolator interpolator5 = defpackage.vxt.a;
                                        ((android.widget.FrameLayout) frameLayout2).setTranslationY(f2);
                                        return;
                                    }
                                    float f3 = f2 * 4.0f;
                                    if (f3 > 1.0f) {
                                        if (f3 <= 2.0f) {
                                            f3 = 2.0f - f3;
                                        } else {
                                            f3 = f3 <= 3.0f ? f3 - 2.0f : 4.0f - f3;
                                        }
                                    }
                                    ahvr.bY(f3 >= 0.0f && f3 <= 255.0f);
                                    int iRound = java.lang.Math.round(f3 * 255.0f);
                                    boolean z = iRound >= 0 && iRound <= 255;
                                    android.view.View view3 = frameLayout2;
                                    ahvr.bY(z);
                                    view3.getBackground().setAlpha(iRound);
                                }
                            });
                            final int i7 = 0;
                            hshVar2.g(0.0f, 1.0f, interpolator3, new hsf() { // from class: vxs
                                public final void a(float f2) {
                                    int i8 = i7;
                                    if (i8 == 0) {
                                        android.view.animation.Interpolator interpolator4 = defpackage.vxt.a;
                                        android.view.View view2 = viewFindViewById3;
                                        view2.setScaleY(f2);
                                        view2.setScaleX(f2);
                                        return;
                                    }
                                    if (i8 == 1) {
                                        android.view.animation.Interpolator interpolator5 = defpackage.vxt.a;
                                        ((android.widget.FrameLayout) viewFindViewById3).setTranslationY(f2);
                                        return;
                                    }
                                    float f3 = f2 * 4.0f;
                                    if (f3 > 1.0f) {
                                        if (f3 <= 2.0f) {
                                            f3 = 2.0f - f3;
                                        } else {
                                            f3 = f3 <= 3.0f ? f3 - 2.0f : 4.0f - f3;
                                        }
                                    }
                                    ahvr.bY(f3 >= 0.0f && f3 <= 255.0f);
                                    int iRound = java.lang.Math.round(f3 * 255.0f);
                                    boolean z = iRound >= 0 && iRound <= 255;
                                    android.view.View view3 = viewFindViewById3;
                                    ahvr.bY(z);
                                    view3.getBackground().setAlpha(iRound);
                                }
                            });
                            hshVar2.i(new defpackage.vet(frameLayout2, 10));
                            hshVar2.h(new kkz(frameLayout2, 14));
                            hshVar2.setDuration(defpackage.vxt.a(voicemailEntryView3)).start();
                        }
                        if (defpackage.vyd.c(vyjVar)) {
                            vydVarY.s.i((java.lang.String) null).b(mce.dx);
                        } else {
                            vydVarY.s.i((java.lang.String) null).b(mce.dy);
                        }
                    } else if (!defpackage.vyd.c(vyjVar)) {
                        defpackage.vyc vycVar2 = (defpackage.vyc) vydVarY.m.eZ();
                        defpackage.zlr zlrVar2 = vydVarY.t;
                        android.widget.LinearLayout linearLayout2 = vycVar2.c;
                        kiuVar2 = uzoVar.d;
                        if (kiuVar2 == null) {
                            kiuVar2 = kiu.a;
                        }
                        nwvVarB2 = nwv.b(uzoVar.f);
                        if (nwvVarB2 == null) {
                            nwvVarB2 = nwv.a;
                        }
                        zlrVar2.h(linearLayout2, kiuVar2, nwvVarB2);
                        android.view.ViewGroup viewGroup4 = vycVar2.a;
                        hhb.b(viewGroup4);
                        vydVarY.a(uzoVar);
                        viewGroup4.setVisibility(0);
                        android.widget.ImageView imageView = vydVarY.k;
                        imageView.setScaleX(0.0f);
                        imageView.setScaleY(0.0f);
                    } else if (!vydVarY.o.isPresent()) {
                    }
                } else if (!defpackage.vyd.c(vyjVar)) {
                    defpackage.vyc vycVar3 = (defpackage.vyc) vydVarY.m.eZ();
                    defpackage.zlr zlrVar3 = vydVarY.t;
                    android.widget.LinearLayout linearLayout3 = vycVar3.c;
                    kiuVar2 = uzoVar.d;
                    if (kiuVar2 == null) {
                        kiuVar2 = kiu.a;
                    }
                    nwvVarB2 = nwv.b(uzoVar.f);
                    if (nwvVarB2 == null) {
                        nwvVarB2 = nwv.a;
                    }
                    zlrVar3.h(linearLayout3, kiuVar2, nwvVarB2);
                    android.view.ViewGroup viewGroup5 = vycVar3.a;
                    hhb.b(viewGroup5);
                    vydVarY.a(uzoVar);
                    viewGroup5.setVisibility(0);
                    android.widget.ImageView imageView2 = vydVarY.k;
                    imageView2.setScaleX(0.0f);
                    imageView2.setScaleY(0.0f);
                } else if (!vydVarY.o.isPresent()) {
                }
                optional = vyjVar.d;
                bool = java.lang.Boolean.FALSE;
                if (true != ((java.lang.Boolean) optional.orElse(bool)).booleanValue()) {
                    i3 = 0;
                } else {
                    i3 = i2;
                }
                quickContactBadge.setVisibility(i3);
                android.widget.ImageView imageView3 = vydVarY.j;
                if (true == ((java.lang.Boolean) optional.orElse(bool)).booleanValue()) {
                    i2 = 0;
                }
                imageView3.setVisibility(i2);
                r6 = vydVarY.e;
                ahpz ahpzVar = vydVarY.c;
                r6.setOnClickListener(new defpackage.ahpp(ahpzVar, 1046, "Clicked voicemail card", new defpackage.vxa(kiuVar3, 3), 0));
                r6.setOnLongClickListener(new defpackage.ahpx(ahpzVar, 1047, "Clicked voicemailCard#onVoicemailEntryLongClicked", new lmf(kiuVar3, 6)));
                quickContactBadge.setOnLongClickListener(new defpackage.ahpx(ahpzVar, 1048, "Clicked quickContactBadge#onVoicemailEntryLongClicked", new lmf(kiuVar3, 7)));
                vydVarY.k.setOnClickListener(new defpackage.ahpp(ahpzVar, 1049, "Clicked play button in voicemail card", new defpackage.vxa(kiuVar3, 4), 0));
                zC = defpackage.vyd.c(vyjVar);
                ebc ebcVar = ebc.c;
                if (optional.isPresent()) {
                    defpackage.ahey aheyVar = vydVarY.a;
                    if (true != ((java.lang.Boolean) optional.orElseThrow(new defpackage.vjq(15))).booleanValue()) {
                        i5 = 2132020884;
                    } else {
                        i5 = 2132020881;
                    }
                    string = aheyVar.getString(i5);
                } else {
                    defpackage.ahey aheyVar2 = vydVarY.a;
                    if (true != zC) {
                        i4 = 2132020882;
                    } else {
                        i4 = 2132020885;
                    }
                    string = aheyVar2.getString(i4);
                }
                dzs.h((android.view.View) r6, ebcVar, string, new defpackage.vya(kiuVar3, 0));
                if (optional.isPresent()) {
                    dzs.h((android.view.View) r6, ebc.d, (java.lang.CharSequence) null, (ebo) null);
                } else {
                    dzs.h((android.view.View) r6, ebc.d, vydVarY.a.getString(2132020883), new defpackage.vya(kiuVar3, 2));
                }
                ahoqVarW.close();
                vydVarY.o = j$.util.Optional.of(vyjVar);
                com.google.android.material.card.MaterialCardView materialCardView = (com.google.android.material.card.MaterialCardView) voicemailEntryView.findViewById(2131427671);
                ahbv ahbvVar = this.a;
                defpackage.vxy vxyVar = vyjVar.f;
                ahbvVar.C(materialCardView, new inx(vxyVar.a, vxyVar.b));
            }
            if (vydVarY.d(vyjVar)) {
                vycVar = (defpackage.vyc) vydVarY.m.eZ();
                defpackage.zlr zlrVar4 = vydVarY.t;
                android.widget.LinearLayout linearLayout4 = vycVar.c;
                kiuVar = uzoVar.d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                nwvVarB = nwv.b(uzoVar.f);
                if (nwvVarB == null) {
                    nwvVarB = nwv.a;
                }
                zlrVar4.h(linearLayout4, kiuVar, nwvVarB);
                vydVarY.a(uzoVar);
                if (defpackage.vyd.c(vyjVar)) {
                    android.view.ViewGroup viewGroup6 = vycVar.a;
                    hhb.b(viewGroup6);
                    viewGroup6.setVisibility(0);
                    com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView4 = vydVarY.b;
                    hsh hshVar3 = vydVarY.l;
                    android.view.animation.Interpolator interpolator4 = defpackage.vxt.a;
                    android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) voicemailEntryView4.findViewById(2131428210);
                    android.view.ViewGroup viewGroup7 = (android.view.ViewGroup) voicemailEntryView4.findViewById(2131429465);
                    android.view.View viewFindViewById4 = voicemailEntryView4.findViewById(2131428685);
                    aooh.c(viewGroup7);
                    int iB3 = defpackage.vxt.b(viewGroup7);
                    viewGroup7.getLayoutParams().height = iB3;
                    hshVar3.d();
                    hshVar3.j(0.33333334f, 0.0f, 1.0f, defpackage.vxt.a, new kkz(frameLayout3, 13));
                    hshVar3.g(0.0f, iB3, defpackage.vxt.d, new kkz(frameLayout3, 15));
                    hshVar3.g(-defpackage.vxt.c(voicemailEntryView4), 0.0f, defpackage.vxt.c, new kkz(frameLayout3, 16));
                    hshVar3.j(0.5f, 1.0f, 0.0f, defpackage.vxt.b, new kkz(viewFindViewById4, 17));
                    hshVar3.h(new kkz(frameLayout3, 18));
                    hshVar3.i(new defpackage.wdm(viewGroup7, frameLayout3, 1));
                    hshVar3.setDuration(defpackage.vxt.a(voicemailEntryView4)).start();
                } else {
                    com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView5 = vydVarY.b;
                    hsh hshVar4 = vydVarY.l;
                    android.view.animation.Interpolator interpolator5 = defpackage.vxt.a;
                    final android.view.View frameLayout4 = (android.widget.FrameLayout) voicemailEntryView5.findViewById(2131428210);
                    android.view.ViewGroup viewGroup8 = (android.view.ViewGroup) voicemailEntryView5.findViewById(2131429465);
                    final android.view.View viewFindViewById5 = voicemailEntryView5.findViewById(2131428685);
                    aooh.c(viewGroup8);
                    int iB4 = defpackage.vxt.b(viewGroup8);
                    hshVar4.d();
                    hshVar4.j(0.33333334f, 1.0f, 0.0f, defpackage.vxt.a, new kkz(frameLayout4, 19));
                    hshVar4.g(iB4, 0.0f, defpackage.vxt.d, new kkz(frameLayout4, 20));
                    float f2 = -defpackage.vxt.c(voicemailEntryView5);
                    android.view.animation.Interpolator interpolator6 = defpackage.vxt.c;
                    final int i8 = 1;
                    hshVar4.g(0.0f, f2, interpolator6, new hsf() { // from class: vxs
                        public final void a(float f3) {
                            int i9 = i8;
                            if (i9 == 0) {
                                android.view.animation.Interpolator interpolator7 = defpackage.vxt.a;
                                android.view.View view2 = frameLayout4;
                                view2.setScaleY(f3);
                                view2.setScaleX(f3);
                                return;
                            }
                            if (i9 == 1) {
                                android.view.animation.Interpolator interpolator8 = defpackage.vxt.a;
                                ((android.widget.FrameLayout) frameLayout4).setTranslationY(f3);
                                return;
                            }
                            float f4 = f3 * 4.0f;
                            if (f4 > 1.0f) {
                                if (f4 <= 2.0f) {
                                    f4 = 2.0f - f4;
                                } else {
                                    f4 = f4 <= 3.0f ? f4 - 2.0f : 4.0f - f4;
                                }
                            }
                            ahvr.bY(f4 >= 0.0f && f4 <= 255.0f);
                            int iRound = java.lang.Math.round(f4 * 255.0f);
                            boolean z = iRound >= 0 && iRound <= 255;
                            android.view.View view3 = frameLayout4;
                            ahvr.bY(z);
                            view3.getBackground().setAlpha(iRound);
                        }
                    });
                    final int i9 = 0;
                    hshVar4.g(0.0f, 1.0f, interpolator6, new hsf() { // from class: vxs
                        public final void a(float f3) {
                            int i10 = i9;
                            if (i10 == 0) {
                                android.view.animation.Interpolator interpolator7 = defpackage.vxt.a;
                                android.view.View view2 = viewFindViewById5;
                                view2.setScaleY(f3);
                                view2.setScaleX(f3);
                                return;
                            }
                            if (i10 == 1) {
                                android.view.animation.Interpolator interpolator8 = defpackage.vxt.a;
                                ((android.widget.FrameLayout) viewFindViewById5).setTranslationY(f3);
                                return;
                            }
                            float f4 = f3 * 4.0f;
                            if (f4 > 1.0f) {
                                if (f4 <= 2.0f) {
                                    f4 = 2.0f - f4;
                                } else {
                                    f4 = f4 <= 3.0f ? f4 - 2.0f : 4.0f - f4;
                                }
                            }
                            ahvr.bY(f4 >= 0.0f && f4 <= 255.0f);
                            int iRound = java.lang.Math.round(f4 * 255.0f);
                            boolean z = iRound >= 0 && iRound <= 255;
                            android.view.View view3 = viewFindViewById5;
                            ahvr.bY(z);
                            view3.getBackground().setAlpha(iRound);
                        }
                    });
                    hshVar4.i(new defpackage.vet(frameLayout4, 10));
                    hshVar4.h(new kkz(frameLayout4, 14));
                    hshVar4.setDuration(defpackage.vxt.a(voicemailEntryView5)).start();
                }
                if (defpackage.vyd.c(vyjVar)) {
                    vydVarY.s.i((java.lang.String) null).b(mce.dx);
                } else {
                    vydVarY.s.i((java.lang.String) null).b(mce.dy);
                }
            } else {
                if (!defpackage.vyd.c(vyjVar)) {
                    if (!vydVarY.o.isPresent() && vydVarY.d(vyjVar)) {
                        i2 = 8;
                        ((defpackage.vyc) vydVarY.m.eZ()).a.setVisibility(8);
                        android.widget.ImageView imageView4 = vydVarY.k;
                        imageView4.setScaleX(1.0f);
                        imageView4.setScaleY(1.0f);
                    }
                    optional = vyjVar.d;
                    bool = java.lang.Boolean.FALSE;
                    if (true != ((java.lang.Boolean) optional.orElse(bool)).booleanValue()) {
                        i3 = 0;
                    } else {
                        i3 = i2;
                    }
                    quickContactBadge.setVisibility(i3);
                    android.widget.ImageView imageView5 = vydVarY.j;
                    if (true == ((java.lang.Boolean) optional.orElse(bool)).booleanValue()) {
                        i2 = 0;
                    }
                    imageView5.setVisibility(i2);
                    r6 = vydVarY.e;
                    ahpz ahpzVar2 = vydVarY.c;
                    r6.setOnClickListener(new defpackage.ahpp(ahpzVar2, 1046, "Clicked voicemail card", new defpackage.vxa(kiuVar3, 3), 0));
                    r6.setOnLongClickListener(new defpackage.ahpx(ahpzVar2, 1047, "Clicked voicemailCard#onVoicemailEntryLongClicked", new lmf(kiuVar3, 6)));
                    quickContactBadge.setOnLongClickListener(new defpackage.ahpx(ahpzVar2, 1048, "Clicked quickContactBadge#onVoicemailEntryLongClicked", new lmf(kiuVar3, 7)));
                    vydVarY.k.setOnClickListener(new defpackage.ahpp(ahpzVar2, 1049, "Clicked play button in voicemail card", new defpackage.vxa(kiuVar3, 4), 0));
                    zC = defpackage.vyd.c(vyjVar);
                    ebc ebcVar2 = ebc.c;
                    if (optional.isPresent()) {
                        defpackage.ahey aheyVar3 = vydVarY.a;
                        if (true != ((java.lang.Boolean) optional.orElseThrow(new defpackage.vjq(15))).booleanValue()) {
                            i5 = 2132020884;
                        } else {
                            i5 = 2132020881;
                        }
                        string = aheyVar3.getString(i5);
                    } else {
                        defpackage.ahey aheyVar4 = vydVarY.a;
                        if (true != zC) {
                            i4 = 2132020882;
                        } else {
                            i4 = 2132020885;
                        }
                        string = aheyVar4.getString(i4);
                    }
                    dzs.h((android.view.View) r6, ebcVar2, string, new defpackage.vya(kiuVar3, 0));
                    if (optional.isPresent()) {
                        dzs.h((android.view.View) r6, ebc.d, (java.lang.CharSequence) null, (ebo) null);
                    } else {
                        dzs.h((android.view.View) r6, ebc.d, vydVarY.a.getString(2132020883), new defpackage.vya(kiuVar3, 2));
                    }
                    ahoqVarW.close();
                    vydVarY.o = j$.util.Optional.of(vyjVar);
                    com.google.android.material.card.MaterialCardView materialCardView2 = (com.google.android.material.card.MaterialCardView) voicemailEntryView.findViewById(2131427671);
                    ahbv ahbvVar2 = this.a;
                    defpackage.vxy vxyVar2 = vyjVar.f;
                    ahbvVar2.C(materialCardView2, new inx(vxyVar2.a, vxyVar2.b));
                }
                defpackage.vyc vycVar4 = (defpackage.vyc) vydVarY.m.eZ();
                defpackage.zlr zlrVar5 = vydVarY.t;
                android.widget.LinearLayout linearLayout5 = vycVar4.c;
                kiuVar2 = uzoVar.d;
                if (kiuVar2 == null) {
                    kiuVar2 = kiu.a;
                }
                nwvVarB2 = nwv.b(uzoVar.f);
                if (nwvVarB2 == null) {
                    nwvVarB2 = nwv.a;
                }
                zlrVar5.h(linearLayout5, kiuVar2, nwvVarB2);
                android.view.ViewGroup viewGroup9 = vycVar4.a;
                hhb.b(viewGroup9);
                vydVarY.a(uzoVar);
                viewGroup9.setVisibility(0);
                android.widget.ImageView imageView6 = vydVarY.k;
                imageView6.setScaleX(0.0f);
                imageView6.setScaleY(0.0f);
            }
            i2 = 8;
            optional = vyjVar.d;
            bool = java.lang.Boolean.FALSE;
            if (true != ((java.lang.Boolean) optional.orElse(bool)).booleanValue()) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            quickContactBadge.setVisibility(i3);
            android.widget.ImageView imageView7 = vydVarY.j;
            if (true == ((java.lang.Boolean) optional.orElse(bool)).booleanValue()) {
                i2 = 0;
            }
            imageView7.setVisibility(i2);
            r6 = vydVarY.e;
            ahpz ahpzVar3 = vydVarY.c;
            r6.setOnClickListener(new defpackage.ahpp(ahpzVar3, 1046, "Clicked voicemail card", new defpackage.vxa(kiuVar3, 3), 0));
            r6.setOnLongClickListener(new defpackage.ahpx(ahpzVar3, 1047, "Clicked voicemailCard#onVoicemailEntryLongClicked", new lmf(kiuVar3, 6)));
            quickContactBadge.setOnLongClickListener(new defpackage.ahpx(ahpzVar3, 1048, "Clicked quickContactBadge#onVoicemailEntryLongClicked", new lmf(kiuVar3, 7)));
            vydVarY.k.setOnClickListener(new defpackage.ahpp(ahpzVar3, 1049, "Clicked play button in voicemail card", new defpackage.vxa(kiuVar3, 4), 0));
            zC = defpackage.vyd.c(vyjVar);
            ebc ebcVar3 = ebc.c;
            if (optional.isPresent()) {
                defpackage.ahey aheyVar5 = vydVarY.a;
                if (true != ((java.lang.Boolean) optional.orElseThrow(new defpackage.vjq(15))).booleanValue()) {
                    i5 = 2132020884;
                } else {
                    i5 = 2132020881;
                }
                string = aheyVar5.getString(i5);
            } else {
                defpackage.ahey aheyVar6 = vydVarY.a;
                if (true != zC) {
                    i4 = 2132020882;
                } else {
                    i4 = 2132020885;
                }
                string = aheyVar6.getString(i4);
            }
            dzs.h((android.view.View) r6, ebcVar3, string, new defpackage.vya(kiuVar3, 0));
            if (optional.isPresent()) {
                dzs.h((android.view.View) r6, ebc.d, (java.lang.CharSequence) null, (ebo) null);
            } else {
                dzs.h((android.view.View) r6, ebc.d, vydVarY.a.getString(2132020883), new defpackage.vya(kiuVar3, 2));
            }
            ahoqVarW.close();
            vydVarY.o = j$.util.Optional.of(vyjVar);
            com.google.android.material.card.MaterialCardView materialCardView3 = (com.google.android.material.card.MaterialCardView) voicemailEntryView.findViewById(2131427671);
            ahbv ahbvVar3 = this.a;
            defpackage.vxy vxyVar3 = vyjVar.f;
            ahbvVar3.C(materialCardView3, new inx(vxyVar3.a, vxyVar3.b));
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void f(android.view.View view) {
        ifq ifqVarE;
        iek iekVar;
        defpackage.vyd vydVarY = ((com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView) view).y();
        if (vydVarY.b()) {
            j$.util.Optional optionalB = hgz.b(((defpackage.vyc) vydVarY.m.eZ()).b);
            if (true != optionalB.isPresent() || (iekVar = (ifqVarE = ((android.view.View) optionalB.get()).e()).k) == null) {
                return;
            }
            ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = ied.a;
            }
            if (iedVar != null) {
                ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "pausePlayback$<anonymous>", 352, "AudioPlaybackViewPeer.kt").v("pause audio playback directly from parent view");
                ifqVarE.d.k(iedVar, false);
                ifqVarE.a(iedVar, false);
            }
        }
    }
}
