package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajku implements ajeo {
    private ajku(defpackage.ajst ajstVar, defpackage.ajst ajstVar2) {
        ajstVar.c();
        ajstVar2.c();
    }

    public static ajeo a(ajju ajjuVar) {
        ajjr ajjrVar = ajjuVar.a;
        ajjp ajjpVar = ajjrVar.a;
        if (ajjpVar == ajjp.g) {
            return defpackage.ajld.a(ajjuVar);
        }
        defpackage.ajst ajstVar = ajjuVar.b;
        aftt.L(ajjpVar);
        aftt.R(ajjrVar.b);
        aftt.K(ajjrVar.c);
        return new defpackage.ajku(ajstVar, ajjuVar.c);
    }
}
