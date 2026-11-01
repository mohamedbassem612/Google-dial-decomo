package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nwp {
    public final zrx a;
    public final defpackage.nwo b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final defpackage.hwv f;

    public nwp(zrx zrxVar, defpackage.nwo nwoVar, defpackage.hwv hwvVar) {
        this.a = zrxVar;
        this.b = nwoVar;
        this.f = hwvVar;
    }

    public final defpackage.lvm a() {
        zrx zrxVar = this.a;
        zsc zscVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).p;
        if (zscVar == null) {
            zscVar = zsc.a;
        }
        defpackage.lvm lvmVar = zscVar.c;
        if (lvmVar == null) {
            lvmVar = defpackage.lvm.a;
        }
        aooh.e(lvmVar, "getCallingAccountDialogOptions(...)");
        return lvmVar;
    }
}
