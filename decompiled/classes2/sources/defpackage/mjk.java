package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjk {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/controller/PreCallDialpadToneController");
    public boolean c;
    public final android.content.Context d;
    public final ajct e;
    public final ajct f;
    public final oju g;
    public j$.util.Optional b = j$.util.Optional.empty();
    public final ahda h = new ahda();

    public mjk(android.content.Context context, ajct ajctVar, ajct ajctVar2, oju ojuVar) {
        this.d = context;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.g = ojuVar;
    }

    public final ajcq a(int i, int i2) {
        return this.h.g(new defpackage.mjj(this, i, i2, 0), this.f);
    }

    public final ajcq b() {
        return this.h.g(new defpackage.lgc(this, 14), this.f);
    }
}
