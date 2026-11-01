package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nzz implements aano {
    final /* synthetic */ oac a;

    public nzz(oac oacVar) {
        this.a = oacVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aonj, java.lang.Object] */
    public final void a(android.location.Location location) {
        int i;
        oac oacVar = this.a;
        if (location == null) {
            jxo.a.b().l("com/android/dialer/calllocation/LocationValidator", "checkLocation", 65, "LocationValidator.java").v("no location");
            i = 5;
        } else {
            jxo jxoVar = oacVar.c;
            long epochMilli = j$.time.Instant.now().toEpochMilli() - location.getTime();
            if (epochMilli > (((java.lang.Boolean) jxoVar.c.a()).booleanValue() ? (java.lang.Long) jxoVar.d.a() : (java.lang.Long) jxoVar.b.a()).longValue()) {
                jxo.a.b().l("com/android/dialer/calllocation/LocationValidator", "checkLocation", 76, "LocationValidator.java").x("stale location, age: %d", epochMilli);
                i = 3;
            } else if (location.getAccuracy() > ((java.lang.Long) jxoVar.e.a()).longValue()) {
                jxo.a.b().l("com/android/dialer/calllocation/LocationValidator", "checkLocation", 81, "LocationValidator.java").y("poor accuracy: %g", java.lang.Float.valueOf(location.getAccuracy()));
                i = 4;
            } else if (location.isFromMockProvider()) {
                jxo.a.b().l("com/android/dialer/calllocation/LocationValidator", "checkLocation", 86, "LocationValidator.java").v("from mock provider");
                i = 6;
            } else {
                i = 2;
            }
        }
        int i2 = i - 1;
        if (i2 == 1) {
            oacVar.d.o(rmx.nV);
        } else if (i2 == 2) {
            oacVar.d.o(rmx.nT);
        } else if (i2 == 3) {
            oacVar.d.o(rmx.nU);
        }
        if (i != 2 || location == null) {
            return;
        }
        j$.util.Optional optionalH = oacVar.i.h();
        defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.mws(7), 2);
        if (true == optionalH.isPresent()) {
            optionalH = j$.util.Optional.ofNullable(nzuVar.a.a(optionalH.get()));
        }
        aihd<defpackage.nzt> aihdVar = (aihd) optionalH.orElse((java.lang.Object) null);
        if (aihdVar != null) {
            for (defpackage.nzt nztVar : aihdVar) {
                java.util.concurrent.atomic.AtomicReference atomicReference = nztVar.h;
                if (anty.aq(atomicReference, location)) {
                    nztVar.f.b(mce.bE);
                }
                atomicReference.set(location);
                zpz zpzVar = nztVar.l;
                zpzVar.a(ajcm.a);
                zpzVar.a(aosv.F(nztVar.e, 0, new defpackage.nrw(nztVar, location, (aoln) null, 14), 3));
            }
        }
    }
}
