package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsb {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TranscriptionTypeResolver");
    public defpackage.adru b = defpackage.adru.a;
    private int c = 0;
    private int d = 1;
    private j$.util.Optional e = j$.util.Optional.empty();
    private j$.util.Optional f = j$.util.Optional.empty();

    private final j$.util.Optional b(j$.util.Optional optional) {
        if (optional.equals(this.f)) {
            this.d++;
        } else {
            this.d = 1;
        }
        if (!optional.equals(this.e) && this.d >= this.b.d) {
            this.e = optional;
        }
        this.f = optional;
        return this.c < this.b.c ? j$.util.Optional.empty() : this.e;
    }

    public final j$.util.Optional a(adrr adrrVar, boolean z) {
        if (z) {
            j$.util.Optional optionalOf = this.e;
            if (this.c == 0) {
                optionalOf = j$.util.Optional.empty();
            }
            defpackage.aify aifyVar = adrrVar.a;
            if (aifyVar.isEmpty() || ((adrq) aifyVar.get(0)).a.length() == 0) {
                optionalOf = j$.util.Optional.of(adol.b);
            }
            this.c = 0;
            this.d = 1;
            this.e = j$.util.Optional.empty();
            this.f = j$.util.Optional.empty();
            return optionalOf;
        }
        this.c++;
        defpackage.aify aifyVar2 = adrrVar.a;
        if (aifyVar2.isEmpty()) {
            return b(j$.util.Optional.of(adol.b));
        }
        adrq adrqVar = (adrq) aifyVar2.get(0);
        j$.util.Optional optional = adrqVar.b;
        if (optional.isEmpty()) {
            return b(j$.util.Optional.empty());
        }
        float fFloatValue = ((java.lang.Float) optional.get()).floatValue();
        java.util.Iterator it = defpackage.ahzf.b(' ').a().h(adrqVar.a).iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        int iT = defpackage.aiql.T(j);
        if (iT == 0) {
            return this.e;
        }
        return b(fFloatValue / ((float) iT) > this.b.b ? j$.util.Optional.of(adol.b) : j$.util.Optional.of(adol.a));
    }
}
