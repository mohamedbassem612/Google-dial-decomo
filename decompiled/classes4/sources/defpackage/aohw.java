package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aohw extends defpackage.antw {
    final /* synthetic */ defpackage.aohx a;
    private final defpackage.anql b;
    private boolean c;
    private boolean d;
    private java.lang.Object e;
    private final defpackage.aoht f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aohw(defpackage.aohx aohxVar, defpackage.aoht aohtVar, defpackage.anql anqlVar) {
        super((char[]) null);
        j$.util.Objects.requireNonNull(aohxVar);
        this.a = aohxVar;
        this.c = true;
        this.b = anqlVar;
        this.f = aohtVar;
    }

    @Override // defpackage.antw
    public final void a() {
        this.f.b = true;
    }

    @Override // defpackage.antw
    public final void c() {
        if (this.c) {
            java.lang.Object obj = this.e;
            if (obj == null) {
                this.b.a(anqw.k.f("Half-closed without a request"), new anph());
                return;
            }
            defpackage.aohx aohxVar = this.a;
            defpackage.aoht aohtVar = this.f;
            amwp amwpVar = aohxVar.a;
            int i = amwpVar.a;
            if (i == 0) {
                ((defpackage.ahur) amwpVar.b).e((ahvk) obj, aohtVar);
            } else if (i == 1) {
                defpackage.aoil.c(ahus.e(), aohtVar);
            } else if (i == 2) {
                ((defpackage.ahur) amwpVar.b).d((ahvn) obj, aohtVar);
            } else if (i == 3) {
                ((defpackage.ahur) amwpVar.b).c((ahva) obj, aohtVar);
            } else {
                if (i != 4) {
                    throw new java.lang.AssertionError();
                }
                defpackage.aoil.c(ahus.c(), aohtVar);
            }
            this.e = null;
            if (this.d) {
                e();
            }
        }
    }

    @Override // defpackage.antw
    public final void d(java.lang.Object obj) {
        if (this.e == null) {
            this.e = obj;
        } else {
            this.b.a(anqw.k.f("Too many requests"), new anph());
            this.c = false;
        }
    }

    @Override // defpackage.antw
    public final void e() {
        this.d = true;
    }

    @Override // defpackage.antw
    public final void b() {
    }
}
