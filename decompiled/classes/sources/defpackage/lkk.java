package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lkk {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/callscreen/impl/storage/database/SafeTranscriptDao");
    public final defpackage.ajct a;
    public final j$.util.Optional b;
    public final defpackage.ajwr c = new defpackage.ajwr();

    public lkk(defpackage.ajct ajctVar, j$.util.Optional optional) {
        this.a = ajctVar;
        this.b = optional;
    }

    public static void f(ljz ljzVar) {
        if ((ljzVar.b & 1) != 0) {
            java.lang.String str = ljzVar.c;
            if (str.isEmpty()) {
                return;
            }
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                ((defpackage.aimw) ((defpackage.aimw) d.b()).l("com/android/dialer/callscreen/impl/storage/database/SafeTranscriptDao", "deleteFile", 246, "SafeTranscriptDao.java")).y("file %s doesn't exist", file.getName());
            } else {
                if (file.delete()) {
                    return;
                }
                defpackage.ainm ainmVarD = d.d();
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarD).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/storage/database/SafeTranscriptDao", "deleteFile", (char) 251, "SafeTranscriptDao.java")).y("unable to delete file %s", file.getName());
            }
        }
    }

    public final defpackage.ajcq a(defpackage.aify aifyVar, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < ((defpackage.aike) aifyVar).d; i++) {
            arrayList.add(e((java.lang.String) aifyVar.get(i), new lct(4), j));
        }
        return defpackage.ahvr.aj(arrayList).o(defpackage.ahqx.i(new jse(14)), this.a);
    }

    public final defpackage.ajcq b(java.util.List list) {
        return this.c.e(new defpackage.lkf(this, list, 0), this.a);
    }

    public final defpackage.ajcq c(java.lang.String str) {
        return this.c.e(new ibi(this, str, 15), this.a);
    }

    public final defpackage.ajcq d() {
        return this.c.e(new defpackage.nya(this, 1), this.a);
    }

    public final defpackage.ajcq e(java.lang.String str, java.util.function.Consumer consumer, long j) {
        return this.c.e(new lkg(this, str, consumer, j), this.a);
    }
}
