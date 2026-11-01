package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ieo extends defpackage.aomd {
    boolean a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.iep c;
    int d;
    android.media.AudioDeviceInfo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieo(defpackage.iep iepVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = iepVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, false, this);
    }
}
