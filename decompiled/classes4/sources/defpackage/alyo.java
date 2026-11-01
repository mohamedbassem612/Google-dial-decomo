package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alyo implements alah {
    USE_CASE_UNKNOWN(0),
    USE_CASE_SPAM_FILTER(1),
    USE_CASE_SMART_REPLY(2),
    USE_CASE_DEMO(3),
    USE_CASE_VISUAL_CALLING(4),
    USE_CASE_FERMAT(5),
    USE_CASE_BEESLY(6),
    USE_CASE_BAM(7),
    USE_CASE_AGENTIC_CALL_SCREEN(8);

    public final int j;

    alyo(int i) {
        this.j = i;
    }

    public static defpackage.alyo b(int i) {
        switch (i) {
            case 0:
                return USE_CASE_UNKNOWN;
            case 1:
                return USE_CASE_SPAM_FILTER;
            case 2:
                return USE_CASE_SMART_REPLY;
            case 3:
                return USE_CASE_DEMO;
            case 4:
                return USE_CASE_VISUAL_CALLING;
            case 5:
                return USE_CASE_FERMAT;
            case 6:
                return USE_CASE_BEESLY;
            case 7:
                return USE_CASE_BAM;
            case 8:
                return USE_CASE_AGENTIC_CALL_SCREEN;
            default:
                return null;
        }
    }

    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
