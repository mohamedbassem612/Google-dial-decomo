package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdq {
    public static final aimz a = aimz.i("com/android/dialer/incall/avatar/ui/AvatarFragmentPeer");
    public final defpackage.pdo b;
    public final defpackage.agzc c;
    public final odo d;
    public final aoin e;
    public final ccp f;
    public final iyh g;
    public final defpackage.afpl h;

    public pdq(defpackage.pdo pdoVar, defpackage.afpl afplVar, defpackage.agzc agzcVar, odo odoVar, aoin aoinVar) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        this.b = pdoVar;
        this.h = afplVar;
        this.c = agzcVar;
        this.d = odoVar;
        this.e = aoinVar;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
        this.g = new iyh(this, 17);
    }

    public final defpackage.pdn a() {
        return (defpackage.pdn) this.f.a();
    }
}
