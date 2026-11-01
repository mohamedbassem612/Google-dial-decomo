package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ambr {
    public byte a;
    public java.lang.Object b;

    static /* synthetic */ java.lang.String a(java.lang.Iterable iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((java.lang.CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((java.lang.CharSequence) " ");
                sb.append((java.lang.CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean b(amfu amfuVar, int i) {
        return ((amft) amfuVar.b.get(i)).c == 2 || ((amft) amfuVar.b.get(i)).c == 8;
    }

    public static /* synthetic */ java.lang.Object d(java.lang.Object obj) {
        alqq alqqVar = (alqq) obj;
        akzx akzxVarP = alqqVar.p();
        java.lang.String strTrim = alqqVar.c.replaceAll("\\s+", " ").trim();
        akzxVarP.u();
        alqq alqqVar2 = akzxVarP.b;
        j$.util.Objects.requireNonNull(strTrim);
        alqqVar2.b |= 1;
        alqqVar2.c = strTrim;
        alqp alqpVar = alqqVar.e;
        if (alqpVar == null) {
            alqpVar = alqp.a;
        }
        akzx akzxVarP2 = alqpVar.p();
        akzxVarP2.u();
        akzxVarP2.b.b = albq.a;
        akzxVarP2.aN((java.lang.Iterable) j$.util.Collection.-EL.stream(alqpVar.b).filter(new alzc(13)).filter(new alzc(14)).collect(aido.a));
        alqp alqpVarP = akzxVarP2.p();
        akzxVarP.u();
        alqq alqqVar3 = akzxVarP.b;
        j$.util.Objects.requireNonNull(alqpVarP);
        alqqVar3.e = alqpVarP;
        alqqVar3.b |= 4;
        return akzxVarP.p();
    }

    public final void c(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null segments");
        }
        this.b = aifyVar;
    }

    public final zbq e() {
        if (((~this.a) & 1) == 0) {
            return new zbq((defpackage.zbr) this.b);
        }
        throw new java.lang.IllegalStateException("Missing required properties: type");
    }

    public final defpackage.thv f() {
        java.lang.Object obj;
        if (this.a == 1 && (obj = this.b) != null) {
            return new defpackage.thv((aify) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" cp2PhoneEntryList");
        }
        if (this.a == 0) {
            sb.append(" reachedResultCountLimit");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null cp2PhoneEntryList");
        }
        this.b = aifyVar;
    }

    public final void h() {
        this.a = (byte) 1;
    }
}
