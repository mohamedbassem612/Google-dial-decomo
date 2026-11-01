package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvh extends amzm {
    private final amzg b;

    public hvh(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.hvh.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        int length;
        defpackage.hwj hwjVar = (defpackage.hwj) obj;
        aooh.f(hwjVar, "voiceAssistAudioPlayer");
        defpackage.hgt hgtVar = hwjVar.l;
        if (hgtVar instanceof defpackage.hwc) {
            defpackage.hwc hwcVar = (defpackage.hwc) hgtVar;
            long j = hwcVar.f;
            long j2 = hwcVar.g;
            if (j >= j2) {
                length = hwcVar.a.length();
            } else {
                long j3 = j + 300;
                java.lang.String str = hwcVar.a;
                float length2 = str.length();
                java.text.BreakIterator lineInstance = java.text.BreakIterator.getLineInstance();
                lineInstance.setText(str);
                int iCurrent = lineInstance.current();
                while ((j3 / j2) * length2 > iCurrent && lineInstance.current() != -1) {
                    iCurrent = lineInstance.next();
                }
                length = lineInstance.current() == -1 ? str.length() : iCurrent;
            }
        } else {
            length = 0;
        }
        return aiql.z(java.lang.Integer.valueOf(length));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
