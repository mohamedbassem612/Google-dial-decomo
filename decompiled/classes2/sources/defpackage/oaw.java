package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oaw extends amzm {
    private final amzg b;

    public oaw(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.oaw.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.Object obj2;
        aihd aihdVar = (aihd) obj;
        aooh.f(aihdVar, "snackbarKeys");
        if (aihdVar.size() > 1) {
            defpackage.oaj.a.d().l("com/android/dialer/emergencycalling/impl/service/EmergencyCallingProducerModule$Companion", "produceSelectedSnackbarKey", 348, "EmergencyCallingProducerModule.kt").y("More than one snackbar exists at the same time: %s", ajsz.cr(aihdVar, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.mws(11), 30));
        }
        java.util.Iterator it = aihdVar.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                int i = ((defpackage.obi) next).f;
                do {
                    java.lang.Object next2 = it.next();
                    int i2 = ((defpackage.obi) next2).f;
                    if (i > i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(obj2);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
