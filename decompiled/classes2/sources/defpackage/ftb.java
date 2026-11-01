package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ftb implements defpackage.frj {
    private final defpackage.fsw a;
    private final long[] b;
    private final java.util.Map c;
    private final java.util.Map d;
    private final java.util.Map e;

    public ftb(defpackage.fsw fswVar, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        this.a = fswVar;
        this.d = map2;
        this.e = map3;
        this.c = j$.util.DesugarCollections.unmodifiableMap(map);
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i = 0;
        fswVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((java.lang.Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.frj
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.frj
    public final int b(long j) {
        long[] jArr = this.b;
        int iAb = eum.ab(jArr, j, false);
        if (iAb >= jArr.length) {
            return -1;
        }
        return iAb;
    }

    @Override // defpackage.frj
    public final long c(int i) {
        return this.b[i];
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
    @Override // defpackage.frj
    public final java.util.List e(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.fsw fswVar = this.a;
        java.lang.String str = fswVar.h;
        fswVar.e(j, str, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        fswVar.g(j, false, str, treeMap);
        java.util.Map map = this.c;
        java.util.Map map2 = this.d;
        fswVar.f(j, map, map2, str, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.util.Map map3 = this.e;
            android.util.Pair pair = (android.util.Pair) arrayList.get(i);
            java.lang.String str2 = (java.lang.String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = android.util.Base64.decode(str2, 0);
                android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                defpackage.fsz fszVar = (defpackage.fsz) map2.get(pair.first);
                ahvr.ci(fszVar);
                defpackage.esr esrVar = new defpackage.esr();
                esrVar.b(bitmapDecodeByteArray);
                esrVar.e = fszVar.b;
                esrVar.f = 0;
                esrVar.c(fszVar.c, 0);
                esrVar.d = fszVar.e;
                esrVar.g = fszVar.f;
                esrVar.h = fszVar.g;
                esrVar.j = fszVar.j;
                arrayList2.add(esrVar.a());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            defpackage.fsz fszVar2 = (defpackage.fsz) map2.get(entry.getKey());
            ahvr.ci(fszVar2);
            defpackage.esr esrVar2 = (defpackage.esr) entry.getValue();
            java.lang.CharSequence charSequence = esrVar2.a;
            ahvr.ci(charSequence);
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
            for (defpackage.fsu fsuVar : (defpackage.fsu[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), defpackage.fsu.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(fsuVar), spannableStringBuilder.getSpanEnd(fsuVar), (java.lang.CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            esrVar2.c(fszVar2.c, fszVar2.d);
            esrVar2.d = fszVar2.e;
            esrVar2.e = fszVar2.b;
            esrVar2.g = fszVar2.f;
            esrVar2.e(fszVar2.i, fszVar2.h);
            esrVar2.j = fszVar2.j;
            arrayList2.add(esrVar2.a());
        }
        return arrayList2;
    }
}
