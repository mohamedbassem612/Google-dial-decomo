package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q implements j$.time.format.e {
    public final j$.time.temporal.l a;
    public final j$.time.format.TextStyle b;
    public final j$.time.format.z c;
    public volatile j$.time.format.i d;

    public q(j$.time.temporal.l lVar, j$.time.format.TextStyle textStyle, j$.time.format.z zVar) {
        this.a = lVar;
        this.b = textStyle;
        this.c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        java.lang.Long lA = wVar.a(this.a);
        j$.time.format.DateTimeFormatter dateTimeFormatter = wVar.b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.a aVar = (j$.time.chrono.a) wVar.a.G(j$.time.temporal.m.b);
        java.lang.String strC = (aVar == null || aVar == j$.time.chrono.q.c) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(aVar, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new j$.time.format.i(this.a, 1, 19, j$.time.format.d0.NORMAL);
        }
        return this.d.h(wVar, sb);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        j$.time.format.v vVar2;
        java.lang.CharSequence charSequence2;
        int i2;
        j$.time.format.z zVar = this.c;
        j$.time.temporal.l lVar = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        j$.time.format.DateTimeFormatter dateTimeFormatter = vVar.a;
        j$.time.format.TextStyle textStyle = z ? this.b : null;
        j$.time.chrono.a aVar = vVar.c().c;
        if (aVar == null && (aVar = vVar.a.e) == null) {
            aVar = j$.time.chrono.q.c;
        }
        java.util.Iterator itE = (aVar == null || aVar == j$.time.chrono.q.c) ? zVar.e(lVar, textStyle, dateTimeFormatter.b) : zVar.d(aVar, lVar, textStyle, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) itE.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                j$.time.format.v vVar3 = vVar;
                java.lang.CharSequence charSequence3 = charSequence;
                int i3 = i;
                if (vVar3.g(str, 0, charSequence3, i3, str.length())) {
                    return vVar3.f(this.a, ((java.lang.Long) entry.getValue()).longValue(), i3, str.length() + i3);
                }
                vVar = vVar3;
                charSequence = charSequence3;
                i = i3;
            }
            vVar2 = vVar;
            charSequence2 = charSequence;
            i2 = i;
            if (lVar == j$.time.temporal.a.ERA && !vVar2.c) {
                for (j$.time.chrono.k kVar : aVar.z()) {
                    java.lang.String string = kVar.toString();
                    if (vVar2.g(string, 0, charSequence2, i2, string.length())) {
                        return vVar2.f(this.a, kVar.getValue(), i2, string.length() + i2);
                    }
                }
            }
            if (vVar2.c) {
                return ~i2;
            }
        } else {
            vVar2 = vVar;
            charSequence2 = charSequence;
            i2 = i;
        }
        if (this.d == null) {
            this.d = new j$.time.format.i(this.a, 1, 19, j$.time.format.d0.NORMAL);
        }
        return this.d.k(vVar2, charSequence2, i2);
    }

    public final java.lang.String toString() {
        j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.FULL;
        j$.time.format.TextStyle textStyle2 = this.b;
        j$.time.temporal.l lVar = this.a;
        if (textStyle2 == textStyle) {
            return j$.desugar.sun.nio.fs.h.a("Text(", java.lang.String.valueOf(lVar), ")");
        }
        return "Text(" + java.lang.String.valueOf(lVar) + "," + java.lang.String.valueOf(textStyle2) + ")";
    }
}
