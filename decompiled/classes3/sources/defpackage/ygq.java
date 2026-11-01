package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ygq {
    public boolean a;
    private final java.lang.Object b;

    public ygq() {
        this.b = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.xxh());
    }

    public static boolean a(java.util.List list, defpackage.ygl yglVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ygl yglVar2 = (defpackage.ygl) it.next();
            if (yglVar2 == defpackage.ygl.a || yglVar2 == yglVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(defpackage.ygo ygoVar, int i, java.util.List list, int i2, defpackage.yid yidVar) {
        defpackage.ygp ygpVarB = ygoVar.b(i);
        if (!c(ygpVarB, list, i2, yidVar)) {
            return false;
        }
        int i3 = ygpVarB.d;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m(ygoVar, i - 1, list, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return m(ygoVar, i - 1, list, i2);
        }
        int iL = l(list, i2, yidVar);
        if (iL > 0) {
            return b(ygoVar, i - 1, list, i2, (defpackage.yid) yidVar.u.n().get(iL - 1));
        }
        return false;
    }

    public static boolean c(defpackage.ygp ygpVar, java.util.List list, int i, defpackage.yid yidVar) {
        java.util.List list2;
        java.lang.String str = ygpVar.a;
        if (str != null) {
            if (str.equalsIgnoreCase("G")) {
                if (!(yidVar instanceof defpackage.yhe)) {
                    return false;
                }
            } else if (!str.equals(yidVar.getClass().getSimpleName().toLowerCase(java.util.Locale.US))) {
                return false;
            }
        }
        java.util.List<defpackage.alic> list3 = ygpVar.b;
        if (list3 != null) {
            for (defpackage.alic alicVar : list3) {
                java.lang.Object obj = alicVar.c;
                if (obj == "id") {
                    if (!((java.lang.String) alicVar.b).equals(yidVar.o)) {
                        return false;
                    }
                } else if (obj != "class" || (list2 = yidVar.s) == null || !list2.contains(alicVar.b)) {
                    return false;
                }
            }
        }
        java.util.List list4 = ygpVar.c;
        if (list4 != null) {
            java.util.Iterator it = list4.iterator();
            while (it.hasNext()) {
                if (!((java.lang.String) it.next()).equals("first-child") || l(list, i, yidVar) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static java.util.List e(defpackage.yjp yjpVar) throws org.xml.sax.SAXException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!yjpVar.m()) {
            try {
                arrayList.add((defpackage.ygl) java.lang.Enum.valueOf(defpackage.ygl.class, yjpVar.i(',')));
                if (!yjpVar.o()) {
                    break;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                throw new org.xml.sax.SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    private static int l(java.util.List list, int i, defpackage.yid yidVar) {
        if (i < 0) {
            return -1;
        }
        java.lang.Object obj = list.get(i);
        defpackage.yib yibVar = yidVar.u;
        if (obj != yibVar) {
            return -1;
        }
        java.util.Iterator it = yibVar.n().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((defpackage.yif) it.next()) == yidVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean m(defpackage.ygo ygoVar, int i, java.util.List list, int i2) {
        defpackage.ygp ygpVarB = ygoVar.b(i);
        defpackage.yid yidVar = (defpackage.yid) list.get(i2);
        if (!c(ygpVarB, list, i2, yidVar)) {
            return false;
        }
        int i3 = ygpVarB.d;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m(ygoVar, i - 1, list, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return m(ygoVar, i - 1, list, i2 - 1);
        }
        int iL = l(list, i2, yidVar);
        if (iL > 0) {
            return b(ygoVar, i - 1, list, i2, (defpackage.yid) yidVar.u.n().get(iL - 1));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0231  */
    /* JADX WARN: Code duplicated, block: B:138:0x023d  */
    /* JADX WARN: Code duplicated, block: B:269:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [ygp] */
    /* JADX WARN: Type inference failed for: r7v16, types: [ygp] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [ygp] */
    /* JADX WARN: Type inference failed for: r7v19, types: [ygp] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final defpackage.ygn d(defpackage.yjp yjpVar) throws org.xml.sax.SAXException {
        java.util.ArrayList arrayList;
        int i;
        ?? ygpVar;
        int i2;
        java.lang.String str;
        java.lang.String strH;
        ?? ygpVar2;
        java.lang.String strSubstring;
        defpackage.ygn ygnVar = new defpackage.ygn();
        while (!yjpVar.m()) {
            if (!yjpVar.l("<!--") && !yjpVar.l("-->")) {
                int i3 = 1;
                int i4 = 0;
                if (!yjpVar.k('@')) {
                    java.lang.String str2 = null;
                    if (yjpVar.m()) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(1);
                        defpackage.ygo ygoVar = new defpackage.ygo();
                        while (true) {
                            if (!yjpVar.m() && !yjpVar.m()) {
                                int i5 = yjpVar.b;
                                int i6 = 2;
                                if (ygoVar.d()) {
                                    i = i4;
                                } else if (yjpVar.k('>')) {
                                    yjpVar.j();
                                    i = 2;
                                } else if (yjpVar.k('+')) {
                                    yjpVar.j();
                                    i = 3;
                                } else {
                                    i = i4;
                                }
                                if (yjpVar.k('*')) {
                                    ygpVar = new defpackage.ygp(i, str2);
                                } else {
                                    java.lang.String strQ = yjpVar.q();
                                    if (strQ != null) {
                                        defpackage.ygp ygpVar3 = new defpackage.ygp(i, strQ);
                                        ygoVar.b++;
                                        ygpVar = ygpVar3;
                                    } else {
                                        ygpVar = str2;
                                    }
                                }
                                while (!yjpVar.m()) {
                                    if (!yjpVar.k('.')) {
                                        ygpVar2 = ygpVar;
                                        ygpVar = ygpVar;
                                        if (yjpVar.k('#')) {
                                            if (ygpVar == 0) {
                                                ygpVar2 = new defpackage.ygp(i, str2);
                                            }
                                            java.lang.String strQ2 = yjpVar.q();
                                            if (strQ2 == null) {
                                                throw new org.xml.sax.SAXException("Invalid \"#id\" selector in <style> element");
                                            }
                                            ygpVar2.a("id", i6, strQ2);
                                            ygoVar.b += defpackage.aehk.NEXT_REQUEST_CODE;
                                        }
                                        if (ygpVar != 0) {
                                            if (!yjpVar.k('[')) {
                                                ygpVar = ygpVar2;
                                                if (!yjpVar.k(':')) {
                                                    break;
                                                }
                                                int i7 = yjpVar.b;
                                                if (yjpVar.q() == null) {
                                                    break;
                                                }
                                                if (!yjpVar.k('(')) {
                                                    java.lang.String strSubstring2 = yjpVar.a.substring(i7, yjpVar.b);
                                                    if (ygpVar.c == null) {
                                                        ygpVar.c = new java.util.ArrayList();
                                                    }
                                                    ygpVar.c.add(strSubstring2);
                                                    ygoVar.c();
                                                    break;
                                                }
                                                yjpVar.j();
                                                if (yjpVar.q() == null) {
                                                    java.lang.String strSubstring3 = yjpVar.a.substring(i7, yjpVar.b);
                                                    if (ygpVar.c == null) {
                                                        ygpVar.c = new java.util.ArrayList();
                                                    }
                                                    ygpVar.c.add(strSubstring3);
                                                    ygoVar.c();
                                                    break;
                                                }
                                                yjpVar.j();
                                                if (!yjpVar.k(')')) {
                                                    yjpVar.b = i7 - 1;
                                                    break;
                                                }
                                                java.lang.String strSubstring4 = yjpVar.a.substring(i7, yjpVar.b);
                                                if (ygpVar.c == null) {
                                                    ygpVar.c = new java.util.ArrayList();
                                                }
                                                ygpVar.c.add(strSubstring4);
                                                ygoVar.c();
                                                break;
                                            }
                                            yjpVar.j();
                                            java.lang.String strQ3 = yjpVar.q();
                                            if (strQ3 == null) {
                                                ygpVar = ygpVar2;
                                                throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
                                            }
                                            yjpVar.j();
                                            if (yjpVar.k('=')) {
                                                i2 = i6;
                                            } else if (yjpVar.l("~=")) {
                                                i2 = 3;
                                            } else {
                                                i2 = yjpVar.l("|=") ? 4 : 0;
                                            }
                                            if (i2 != 0) {
                                                ygpVar = ygpVar2;
                                                ygpVar = ygpVar2;
                                                ygpVar = ygpVar2;
                                                yjpVar.j();
                                                if (yjpVar.m()) {
                                                    strH = null;
                                                } else {
                                                    strH = yjpVar.h();
                                                    if (strH == null) {
                                                        ygpVar = ygpVar2;
                                                        strH = yjpVar.q();
                                                    }
                                                }
                                                if (strH == null) {
                                                    ygpVar = ygpVar2;
                                                    throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
                                                }
                                                ygpVar = ygpVar2;
                                                yjpVar.j();
                                                str = strH;
                                            } else {
                                                ygpVar = ygpVar2;
                                                ygpVar = ygpVar2;
                                                ygpVar = ygpVar2;
                                                ygpVar = ygpVar2;
                                                i2 = 0;
                                                str = null;
                                            }
                                            if (!yjpVar.k(']')) {
                                                throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
                                            }
                                            if (i2 == 0) {
                                                i2 = i3;
                                            }
                                            ygpVar.a(strQ3, i2, str);
                                            ygoVar.c();
                                            str2 = null;
                                            i6 = 2;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        if (ygpVar == 0) {
                                            ygpVar = new defpackage.ygp(i, str2);
                                        }
                                        java.lang.String strQ4 = yjpVar.q();
                                        if (strQ4 == null) {
                                            throw new org.xml.sax.SAXException("Invalid \".class\" selector in <style> element");
                                        }
                                        ygpVar.a("class", i6, strQ4);
                                        ygoVar.c();
                                    }
                                }
                                if (ygpVar == 0) {
                                    ygpVar = ygpVar2;
                                    yjpVar.b = i5;
                                    break;
                                }
                                ygpVar = ygpVar2;
                                if (ygoVar.a == null) {
                                    ygoVar.a = new java.util.ArrayList();
                                }
                                ygoVar.a.add(ygpVar);
                                if (yjpVar.o()) {
                                    arrayList.add(ygoVar);
                                    ygoVar = new defpackage.ygo();
                                }
                                i3 = i3;
                                i4 = 0;
                                str2 = null;
                            } else {
                                break;
                            }
                        }
                        if (!ygoVar.d()) {
                            arrayList.add(ygoVar);
                        }
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        break;
                    }
                    if (!yjpVar.k('{')) {
                        throw new org.xml.sax.SAXException("Malformed rule block in <style> element: missing '{'");
                    }
                    yjpVar.j();
                    defpackage.yhw yhwVar = new defpackage.yhw();
                    while (true) {
                        java.lang.String strQ5 = yjpVar.q();
                        yjpVar.j();
                        if (yjpVar.k(':')) {
                            yjpVar.j();
                            if (yjpVar.m()) {
                                strSubstring = null;
                            } else {
                                int i8 = yjpVar.b;
                                int iCharAt = yjpVar.a.charAt(i8);
                                int i9 = i8;
                                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                                    if (!defpackage.yjp.r(iCharAt)) {
                                        i9 = yjpVar.b + 1;
                                    }
                                    iCharAt = yjpVar.d();
                                }
                                if (yjpVar.b > i8) {
                                    strSubstring = yjpVar.a.substring(i8, i9);
                                } else {
                                    yjpVar.b = i8;
                                    strSubstring = null;
                                }
                            }
                            if (strSubstring != null) {
                                yjpVar.j();
                                if (yjpVar.k('!')) {
                                    yjpVar.j();
                                    if (!yjpVar.l("important")) {
                                        throw new org.xml.sax.SAXException("Malformed rule set in <style> element: found unexpected '!'");
                                    }
                                    yjpVar.j();
                                }
                                yjpVar.k(';');
                                defpackage.yjq.c(yhwVar, strQ5, strSubstring);
                                yjpVar.j();
                                if (yjpVar.k('}')) {
                                    yjpVar.j();
                                    java.util.Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        defpackage.ygm ygmVar = new defpackage.ygm((defpackage.ygo) it.next(), yhwVar);
                                        if (ygnVar.a == null) {
                                            ygnVar.a = new java.util.ArrayList();
                                        }
                                        int i10 = 0;
                                        while (true) {
                                            int size = ygnVar.a.size();
                                            java.util.List list = ygnVar.a;
                                            if (i10 >= size) {
                                                list.add(ygmVar);
                                                break;
                                            }
                                            if (((defpackage.ygm) list.get(i10)).a.b > ygmVar.a.b) {
                                                ygnVar.a.add(i10, ygmVar);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    break;
                                }
                                if (yjpVar.m()) {
                                }
                            }
                        }
                        throw new org.xml.sax.SAXException("Malformed rule set in <style> element");
                    }
                }
                java.lang.String strQ6 = yjpVar.q();
                yjpVar.j();
                if (strQ6 == null) {
                    throw new org.xml.sax.SAXException("Invalid '@' rule in <style> element");
                }
                if (this.a || !strQ6.equals("media")) {
                    android.util.Log.w("AndroidSVG CSSParser", java.lang.String.format("Ignoring @%s rule", strQ6));
                    while (!yjpVar.m()) {
                        int iIntValue = yjpVar.g().intValue();
                        if (iIntValue == 59) {
                            if (i4 == 0) {
                                break;
                            }
                            iIntValue = 59;
                            if (iIntValue != 123) {
                                i4++;
                            } else if (iIntValue == 125) {
                                continue;
                            }
                        } else if (iIntValue != 123) {
                            if (iIntValue == 125 && i4 > 0 && (i4 = i4 - 1) == 0) {
                                break;
                            }
                        } else {
                            i4++;
                        }
                    }
                } else {
                    java.util.List listE = e(yjpVar);
                    if (!yjpVar.k('{')) {
                        throw new org.xml.sax.SAXException("Invalid @media rule: missing rule set");
                    }
                    yjpVar.j();
                    if (a(listE, (defpackage.ygl) this.b)) {
                        this.a = true;
                        ygnVar.a(d(yjpVar));
                        this.a = false;
                    } else {
                        d(yjpVar);
                    }
                    if (!yjpVar.k('}')) {
                        throw new org.xml.sax.SAXException("Invalid @media rule: expected '}' at end of rule set");
                    }
                }
                yjpVar.j();
            }
        }
        return ygnVar;
    }

    public final synchronized void f(defpackage.xxe xxeVar, boolean z) {
        if (this.a || z) {
            ((android.os.Handler) this.b).obtainMessage(1, xxeVar).sendToTarget();
            return;
        }
        this.a = true;
        xxeVar.e();
        this.a = false;
    }

    public final eqd g() {
        ahvr.bY(!this.a);
        this.a = true;
        return new eqd((android.util.SparseBooleanArray) this.b);
    }

    public final void h(int i) {
        ahvr.bY(!this.a);
        ((android.util.SparseBooleanArray) this.b).append(i, true);
    }

    public final void i(int... iArr) {
        for (int i : iArr) {
            h(i);
        }
    }

    public final void j() {
        ((android.widget.CheckedTextView) this.b).getCheckMarkDrawable();
    }

    public final void k(android.util.AttributeSet attributeSet) {
        int iR;
        int iR2;
        java.lang.Object obj = this.b;
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) obj;
        android.content.Context context = checkedTextView.getContext();
        int[] iArr = ef.l;
        ajxw ajxwVarD = ajxw.D(context, attributeSet, iArr, 2130968853, 0);
        java.lang.Object obj2 = ajxwVarD.b;
        android.content.Context context2 = checkedTextView.getContext();
        int i = dzs.a;
        dzp.b((android.view.View) obj, context2, iArr, attributeSet, (android.content.res.TypedArray) obj2, 2130968853, 0);
        try {
            if (ajxwVarD.z(1) && (iR2 = ajxwVarD.r(1, 0)) != 0) {
                try {
                    ((android.widget.CheckedTextView) obj).setCheckMarkDrawable(den.bO(((android.widget.CheckedTextView) obj).getContext(), iR2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    if (ajxwVarD.z(0)) {
                        java.lang.Object obj3 = this.b;
                        ((android.widget.CheckedTextView) obj3).setCheckMarkDrawable(den.bO(((android.widget.CheckedTextView) obj3).getContext(), iR));
                    }
                }
            } else if (ajxwVarD.z(0) && (iR = ajxwVarD.r(0, 0)) != 0) {
                java.lang.Object obj4 = this.b;
                ((android.widget.CheckedTextView) obj4).setCheckMarkDrawable(den.bO(((android.widget.CheckedTextView) obj4).getContext(), iR));
            }
            if (ajxwVarD.z(2)) {
                ((android.widget.CheckedTextView) this.b).setCheckMarkTintList(ajxwVarD.s(2));
            }
            if (ajxwVarD.z(3)) {
                java.lang.Object obj5 = this.b;
                int iO = ajxwVarD.o(3, -1);
                android.graphics.Rect rect = iz.a;
                ((android.widget.CheckedTextView) obj5).setCheckMarkTintMode(a.q(iO, (android.graphics.PorterDuff.Mode) null));
            }
        } finally {
            ajxwVarD.x();
        }
    }

    public ygq(defpackage.ygl yglVar) {
        this.a = false;
        this.b = yglVar;
    }

    public ygq(byte[] bArr) {
        this.b = new android.util.SparseBooleanArray();
    }

    public ygq(android.widget.CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }
}
