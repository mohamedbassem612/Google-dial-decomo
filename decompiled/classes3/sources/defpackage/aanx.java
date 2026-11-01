package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aanx implements aafm {
    public aafe a;
    public boolean b;
    final /* synthetic */ defpackage.aany c;

    public aanx(defpackage.aany aanyVar, aafe aafeVar) {
        j$.util.Objects.requireNonNull(aanyVar);
        this.c = aanyVar;
        this.b = true;
        this.a = aafeVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aanm, aann, android.os.IBinder, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Object obj2) {
        aafc aafcVar;
        boolean z;
        defpackage.aaod aaodVar = (defpackage.aaod) obj;
        synchronized (this) {
            aafcVar = this.a.a;
            z = this.b;
            this.a.a();
        }
        if (aafcVar == null) {
            ((zzx) obj2).i(java.lang.Boolean.FALSE);
            return;
        }
        aec aecVar = aaodVar.a;
        synchronized (aecVar) {
            ?? r7 = (defpackage.aanm) aecVar.remove(aafcVar);
            if (r7 == 0) {
                ((zzx) obj2).i(java.lang.Boolean.FALSE);
                return;
            }
            r7.a.b().a();
            if (!z) {
                ((zzx) obj2).i(java.lang.Boolean.TRUE);
            } else if (aaodVar.N(defpackage.aani.j)) {
                defpackage.aanv aanvVar = (defpackage.aanv) aaodVar.v();
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = com.google.android.gms.location.internal.LocationReceiver.a(null, r7, "ILocationListener@" + java.lang.System.identityHashCode(r7));
                aaew aanzVar = new defpackage.aanz(java.lang.Boolean.TRUE, (zzx) obj2);
                android.os.Parcel parcelEP = aanvVar.eP();
                yld.d(parcelEP, abstractSafeParcelableA);
                yld.f(parcelEP, aanzVar);
                aanvVar.eR(89, parcelEP);
            } else {
                ((defpackage.aanv) aaodVar.v()).a(new com.google.android.gms.location.internal.LocationRequestUpdateData(2, null, r7, null, null, new defpackage.aaoa(java.lang.Boolean.TRUE, (zzx) obj2), null));
            }
        }
    }

    public final synchronized aafe b() {
        return this.a;
    }

    public final synchronized void c(aafe aafeVar) {
        aafe aafeVar2 = this.a;
        if (aafeVar2 != aafeVar) {
            aafeVar2.a();
            this.a = aafeVar;
        }
    }
}
