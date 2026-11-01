package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kli implements agtk {
    final /* synthetic */ defpackage.klo a;

    public kli(defpackage.klo kloVar) {
        j$.util.Objects.requireNonNull(kloVar);
        this.a = kloVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        this.a.L.i((java.lang.String) null).a(mcd.al);
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.klo kloVar = this.a;
        j$.util.Optional optionalOfNullable = kloVar.G;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.kfd) optionalOfNullable.get()).b);
        }
        defpackage.klg klgVar = new defpackage.klg(this);
        if (true == optionalOfNullable.isPresent()) {
            klgVar.a.d((defpackage.kdf) optionalOfNullable.get());
        }
        kloVar.R.aF(kloVar.x, new java.lang.Runnable() { // from class: klh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.L.i((java.lang.String) null).b(mce.do);
            }
        });
    }

    public final /* synthetic */ void d(defpackage.kdf kdfVar) {
        this.a.b(kdfVar);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
