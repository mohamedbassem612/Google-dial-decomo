package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vkt {
    public final android.telecom.PhoneAccountHandle a;
    public j$.util.Optional b;
    public j$.util.Optional c;
    public final /* synthetic */ vku d;
    private final int e;

    public vkt(vku vkuVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        j$.util.Objects.requireNonNull(vkuVar);
        this.d = vkuVar;
        this.b = j$.util.Optional.empty();
        this.c = j$.util.Optional.empty();
        this.a = phoneAccountHandle;
        this.e = i;
    }

    public final void a(dsd dsdVar, int i) {
        this.d.e(this.e, 3, 4);
        this.b = j$.util.Optional.empty();
        this.c = j$.util.Optional.empty();
        if (i != -1) {
            dsdVar.d(new defpackage.vex(i));
        } else {
            dsdVar.b((java.lang.Object) null);
        }
    }
}
