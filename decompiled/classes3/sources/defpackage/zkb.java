package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zkb {
    public static final aimz a = aimz.i("com/google/android/dialershared/featureguarding/safeproducers/SafeProducedMultibindingSet");

    public static aihd a(java.util.Set set) {
        return (aihd) j$.util.Collection.-EL.stream(set).filter(new defpackage.wrm(14)).map(new defpackage.yoz(11)).collect(aido.b);
    }

    public static ajcq b(java.util.Set set, ajct ajctVar) {
        aihd aihdVar = (aihd) j$.util.Collection.-EL.stream(a(set)).map(new defpackage.yoz(9)).collect(aido.b);
        return ahvr.ah(aihdVar).o(new defpackage.wwy(aihdVar, 20), ajctVar);
    }
}
