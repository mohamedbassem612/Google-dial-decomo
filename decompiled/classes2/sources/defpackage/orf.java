package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class orf implements defpackage.oqx {
    private final android.content.Context a;
    private final android.content.Intent b;
    private final int c;
    private final int d;
    private final aify e;
    private final rlv f;
    private final j$.util.Optional g;

    public orf(android.content.Context context, android.content.Intent intent, int i, int i2, aify aifyVar, j$.util.Optional optional) {
        this.a = context;
        this.b = intent;
        this.c = i;
        this.d = i2;
        this.e = aifyVar;
        this.g = optional;
        this.f = pez.ar(context).bt();
    }

    private final ahok f(java.lang.String str) {
        return pez.ar(this.a).fi().f(421, str);
    }

    @Override // defpackage.oqx
    public final int a() {
        return this.d;
    }

    @Override // defpackage.oqx
    public final java.lang.String b() {
        return this.a.getString(this.c);
    }

    @Override // defpackage.oqx
    public final void c(az azVar) {
        ahok ahokVarF;
        int i = this.c;
        if (i == 2132018200) {
            ahokVarF = f("Clicked create new contact button in voicemail dropdown menu");
        } else if (i == 2132017293) {
            ahokVarF = f("Clicked add to a contact button in voicemail dropdown menu");
        } else {
            ahokVarF = i == 2132020074 ? f("Clicked send a message button in voicemail dropdown menu") : f("Clicked unknown button in voicemail dropdown menu");
        }
        try {
            az azVar2 = this.a;
            pez.ar(azVar2);
            this.g.isPresent();
            if (azVar == null) {
                azVar = azVar2;
            }
            uxw.b(azVar, this.b, 2132017288);
            aify aifyVar = this.e;
            rlv rlvVar = this.f;
            j$.util.Objects.requireNonNull(rlvVar);
            j$.lang.Iterable.-EL.forEach(aifyVar, new defpackage.fcg(rlvVar, 19));
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.oqx
    public final void e() {
        c(null);
    }

    public final java.lang.String toString() {
        return "IntentModule[" + this.b.toString() + ']';
    }

    @Override // defpackage.oqx
    public final /* synthetic */ void d() {
    }
}
