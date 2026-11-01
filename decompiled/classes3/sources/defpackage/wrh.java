package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrh {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/storage/XatuSessionPersistor");
    public final defpackage.wqo b;
    public final wqr c;
    public final ajct d;
    public final ajct e;
    public final android.content.Context f;
    public final defpackage.wqw g;
    public final aoin h;
    public final aoin i;

    public wrh(defpackage.wqo wqoVar, wqr wqrVar, ajct ajctVar, ajct ajctVar2, android.content.Context context, defpackage.wqw wqwVar, aoin aoinVar, aoin aoinVar2) {
        this.b = wqoVar;
        this.c = wqrVar;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.f = context;
        this.g = wqwVar;
        this.h = aoinVar;
        this.i = aoinVar2;
    }

    public static j$.util.Optional a(defpackage.wrc wrcVar) {
        j$.util.Optional optional = wrcVar.i;
        optional.isPresent();
        return j$.util.Optional.ofNullable(java.lang.Integer.valueOf((int) java.lang.Math.ceil(((double) ((java.lang.Integer) optional.get()).intValue()) / 1000.0d)));
    }
}
