package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbs extends anty {
    public boolean a;
    public final /* synthetic */ defpackage.akbw b;
    public final anty c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbs(defpackage.akbw akbwVar, anty antyVar) {
        super((byte[]) null, (byte[]) null, (byte[]) null);
        j$.util.Objects.requireNonNull(akbwVar);
        this.b = akbwVar;
        this.a = false;
        this.c = antyVar;
    }

    public final void a(anqw anqwVar, anph anphVar) {
        this.b.a.execute(new akaz(this, anqwVar, anphVar, 9));
    }

    public final void c(anph anphVar) {
        this.b.a.execute(new akbr(this, anphVar, 7, (byte[]) null));
    }

    public final void d(java.lang.Object obj) {
        this.b.a.execute(new akbr(this, obj, 8, (byte[]) null));
    }

    public final void e() {
        this.b.a.execute(new defpackage.ahts(this, 16));
    }
}
