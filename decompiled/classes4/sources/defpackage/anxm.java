package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum anxm {
    NO_ERROR(0, anqw.l),
    PROTOCOL_ERROR(1, anqw.k),
    INTERNAL_ERROR(2, anqw.k),
    FLOW_CONTROL_ERROR(3, anqw.k),
    SETTINGS_TIMEOUT(4, anqw.k),
    STREAM_CLOSED(5, anqw.k),
    FRAME_SIZE_ERROR(6, anqw.k),
    REFUSED_STREAM(7, anqw.l),
    CANCEL(8, anqw.c),
    COMPRESSION_ERROR(9, anqw.k),
    CONNECT_ERROR(10, anqw.k),
    ENHANCE_YOUR_CALM(11, anqw.h.f("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, anqw.f.f("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, anqw.d);

    private static final defpackage.anxm[] p;
    public final anqw o;
    private final int r;

    static {
        defpackage.anxm[] anxmVarArrValues = values();
        defpackage.anxm[] anxmVarArr = new defpackage.anxm[((int) anxmVarArrValues[anxmVarArrValues.length - 1].a()) + 1];
        for (defpackage.anxm anxmVar : anxmVarArrValues) {
            anxmVarArr[(int) anxmVar.a()] = anxmVar;
        }
        p = anxmVarArr;
    }

    anxm(int i, anqw anqwVar) {
        this.r = i;
        java.lang.String strConcat = "HTTP/2 error code: ".concat(java.lang.String.valueOf(name()));
        java.lang.String str = anqwVar.p;
        if (str != null) {
            strConcat = strConcat + " (" + str + ')';
        }
        this.o = anqwVar.f(strConcat);
    }

    public static defpackage.anxm b(long j) {
        defpackage.anxm[] anxmVarArr = p;
        if (j >= anxmVarArr.length || j < 0) {
            return null;
        }
        return anxmVarArr[(int) j];
    }

    public final long a() {
        return this.r;
    }
}
