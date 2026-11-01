package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ttq extends defpackage.aoof implements defpackage.aonj {
    public static final defpackage.ttq a = new defpackage.ttq();

    public ttq() {
        super(1, defpackage.ttj.class, "toSharpieDataEntry", "toSharpieDataEntry(Lcom/android/dialer/sharpie/impl/storage/database/SharpieDataEntity;)Lcom/android/dialer/sharpie/impl/storage/SharpieDataEntry;", 1);
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i;
        tuf tufVar = (tuf) obj;
        defpackage.aooh.f(tufVar, "p0");
        defpackage.aooh.f(tufVar, "<this>");
        j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(tufVar.a);
        defpackage.aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
        java.lang.String str = tufVar.b;
        int iB = defpackage.ttj.b(tufVar.c);
        int iB2 = defpackage.ttj.b(tufVar.d);
        tue tueVar = tufVar.e;
        tue tueVar2 = tue.a;
        tud tudVar = tud.a;
        int iOrdinal = tueVar.ordinal();
        int i2 = 1;
        if (iOrdinal == 0) {
            i = i2;
        } else if (iOrdinal != 1) {
            i2 = 3;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.aois();
                }
                i2 = 4;
            }
            i = i2;
        } else {
            i = 2;
        }
        return new ttk(instantOfEpochMilli, str, iB, iB2, i);
    }
}
