package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ien extends defpackage.aomh implements defpackage.aonj {
    int a;
    final /* synthetic */ defpackage.iep b;
    final /* synthetic */ android.media.AudioDeviceInfo c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ien(defpackage.iep iepVar, android.media.AudioDeviceInfo audioDeviceInfo, boolean z, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.b = iepVar;
        this.c = audioDeviceInfo;
        this.d = z;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ien(this.b, this.c, this.d, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.iep iepVar = this.b;
            android.media.AudioDeviceInfo audioDeviceInfo = this.c;
            boolean z = this.d;
            this.a = 1;
            if (iepVar.d(audioDeviceInfo, z, this) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }
}
