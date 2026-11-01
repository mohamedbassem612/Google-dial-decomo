package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahoe implements ahqj {
    public final ahok a(java.lang.String str, ahou ahouVar, int i, int i2) {
        ahpe ahpeVarA = ahns.a();
        final ahoo ahooVar = ahpeVarA.c;
        final ahpj ahodVar = (ahooVar == null || ahooVar == ahoo.a) ? new ahod(str, ahod.a, ahod.b, ahouVar, ahpeVarA) : ahooVar.r(str, i2, ahouVar, ahpeVarA);
        ahns.u(ahodVar);
        if (ahooVar == ahodVar.b()) {
            return ahodVar;
        }
        final int i3 = 1;
        return new ahok() { // from class: ahqk
            public final void close() {
                int i4 = i3;
                if (i4 == 0) {
                    ahodVar.close();
                    ahns.u(ahooVar);
                    return;
                }
                ahpj ahpjVar = ahodVar;
                if (i4 != 1) {
                    ahpjVar.close();
                    ahns.u(ahooVar);
                } else {
                    ahpjVar.close();
                    ahns.u(ahooVar);
                }
            }
        };
    }

    public final ahok b(ahou ahouVar, long j, long j2, int i, int i2) {
        return a("Application creation", ahouVar, 2, i2);
    }

    public final ahpi c(java.lang.String str, ahou ahouVar, int i, int i2) {
        ahpe ahpeVarA = ahns.a();
        ahoo ahooVar = ahpeVarA.c;
        ahpj ahodVar = (ahooVar == null || ahooVar == ahoo.a) ? new ahod(str, ahod.a, ahod.b, ahouVar, ahpeVarA) : ahooVar.r(str, i2, ahouVar, ahpeVarA);
        ahns.u(ahodVar);
        ahoq ahoqVar = new ahoq(ahodVar, ahooVar == ahoo.a);
        j$.util.Objects.requireNonNull(this);
        return new ahpi(ahoqVar);
    }
}
