package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aimc extends defpackage.aimg {
    public final aijo a;
    private final defpackage.aimn b;
    private final int d;

    public aimc(aijo aijoVar, defpackage.aimn aimnVar) {
        this.a = aijoVar;
        this.b = aimnVar;
        this.d = aijoVar.i().size() + 1;
    }

    @Override // defpackage.aimg
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aimg
    public final defpackage.aizh b(java.lang.Object obj) {
        defpackage.aizh aizhVar = defpackage.aizh.a;
        defpackage.aizg aizgVar = new defpackage.aizg(10);
        this.b.a(obj, new defpackage.aimb(this, aizgVar));
        return aizgVar.a();
    }
}
