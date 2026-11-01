package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nyz {
    public static final aimz a = aimz.i("com/android/dialer/duo/tidepods/DuoUpgradeController");
    public final android.content.Context d;
    public final android.telecom.Call e;
    public final nwu f;
    public final zrw g;
    public final ajct h;
    public final aoin i;
    public final qbe k;
    private final zmn l;
    public final qtx b = new defpackage.nyy(this, 0);
    public final zni c = new defpackage.leq(this, 2);
    public j$.util.Optional j = j$.util.Optional.empty();

    public nyz(aoin aoinVar, android.content.Context context, android.telecom.Call call, nwu nwuVar, zmn zmnVar, zrw zrwVar, ajct ajctVar, qbe qbeVar) {
        this.i = aoinVar;
        this.d = context;
        this.e = call;
        this.f = nwuVar;
        this.l = zmnVar;
        this.g = zrwVar;
        this.h = ajctVar;
        this.k = qbeVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.e.getDetails());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((android.telecom.Call.Details) optionalOfNullable.get()).getAccountHandle());
        }
        zmn zmnVar = this.l;
        j$.util.Objects.requireNonNull(zmnVar);
        defpackage.kdb kdbVar = new defpackage.kdb(zmnVar, 20);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = ((zmn) kdbVar.a).c((android.telecom.PhoneAccountHandle) optionalOfNullable.get());
            optionalOfNullable.getClass();
        }
        return (true != optionalOfNullable.isPresent() || true == anty.aD((java.lang.String) optionalOfNullable.get())) ? optionalOfNullable : j$.util.Optional.empty();
    }
}
