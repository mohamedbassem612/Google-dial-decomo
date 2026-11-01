package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akcc {
    public static final defpackage.akcc a = new defpackage.akcc(1, null, null, null);
    public final anmb b;
    public final int c;
    public final apjb d;
    private final ajcq e;

    public akcc(int i, apjb apjbVar, ajcq ajcqVar, anmb anmbVar) {
        this.c = i;
        this.d = apjbVar;
        this.e = ajcqVar;
        this.b = anmbVar;
    }

    public static defpackage.akcc b(anqw anqwVar, anph anphVar) {
        ahvr.ci(anqwVar);
        ahvr.bZ(!anqwVar.h(), "Error status must not be ok");
        return new defpackage.akcc(2, new apjb(anqwVar, anphVar), null, null);
    }

    public static defpackage.akcc c(ajcq ajcqVar) {
        ahvr.ci(ajcqVar);
        return new defpackage.akcc(4, null, ajcqVar, null);
    }

    public final ajcq a() {
        ahvr.bY(this.c == 4);
        return this.e;
    }
}
