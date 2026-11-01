package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkz implements android.text.TextWatcher {
    private static final aimz c = aimz.i("com/android/dialer/dialpadview/ui/PreCallDialpadFormattingTextWatcher");
    public akfi a;
    public final aogc b;
    private final aolr d;
    private final java.util.concurrent.atomic.AtomicBoolean e;
    private final java.util.concurrent.atomic.AtomicBoolean f;

    public mkz(aogc aogcVar, aolr aolrVar) {
        aooh.f(aolrVar, "backgroundContext");
        this.b = aogcVar;
        this.d = aolrVar;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    private final akfi b() {
        akfi akfiVar = this.a;
        if (akfiVar != null) {
            return akfiVar;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    private final java.lang.String c(char c2, boolean z) {
        if (z) {
            akfi akfiVarB = b();
            akfiVarB.a = akfiVarB.b(c2, true);
            java.lang.String str = akfiVarB.a;
            aooh.c(str);
            return str;
        }
        akfi akfiVarB2 = b();
        akfiVarB2.a = akfiVarB2.b(c2, false);
        java.lang.String str2 = akfiVarB2.a;
        aooh.c(str2);
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c A[EDGE_INSN: B:31:0x009c->B:32:0x009d BREAK  A[LOOP:1: B:26:0x0085->B:41:?]] */
    private final void d(java.lang.CharSequence charSequence, int i, int i2) {
        boolean z;
        java.util.Collection collectionAY;
        if (this.a == null) {
            c.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFormattingTextWatcher", "stopFormattingOnNonDialableCharacter", 130, "PreCallDialpadFormattingTextWatcher.kt").v("formatter is null");
            return;
        }
        if (this.e.get()) {
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get()) {
            return;
        }
        if (i2 <= 0) {
            z = false;
            break;
        }
        java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2 + i);
        aooh.f(charSequenceSubSequence, "<this>");
        int length = charSequenceSubSequence.length();
        z = true;
        if (length == 0) {
            collectionAY = aokc.a;
        } else if (length != 1) {
            aooh.f(charSequenceSubSequence, "<this>");
            collectionAY = new java.util.ArrayList(charSequenceSubSequence.length());
            aooh.f(charSequenceSubSequence, "<this>");
            for (int i3 = 0; i3 < charSequenceSubSequence.length(); i3++) {
                collectionAY.add(java.lang.Character.valueOf(charSequenceSubSequence.charAt(i3)));
            }
        } else {
            collectionAY = ajsz.aY(java.lang.Character.valueOf(charSequenceSubSequence.charAt(0)));
        }
        if (!(collectionAY instanceof java.util.Collection) || !collectionAY.isEmpty()) {
            java.util.Iterator it = collectionAY.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (android.telephony.PhoneNumberUtils.isNonSeparator(((java.lang.Character) it.next()).charValue()));
        } else {
            z = false;
            break;
        }
        if (atomicBoolean.compareAndSet(false, z) && atomicBoolean.get()) {
            b().c();
        }
    }

    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.htb(this, str, (aoln) null, 4), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        android.text.Editable editable2;
        int i;
        aooh.f(editable, "s");
        if (this.a == null) {
            c.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFormattingTextWatcher", "afterTextChanged", 65, "PreCallDialpadFormattingTextWatcher.kt").v("formatter is null");
            return;
        }
        if (this.f.compareAndSet(true, editable.length() != 0)) {
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        int selectionEnd = android.text.Selection.getSelectionEnd(editable) - 1;
        b().c();
        java.lang.Character chValueOf = null;
        java.lang.String strC = "";
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < editable.length()) {
            char cCharAt = editable.charAt(i2);
            int i4 = i3 + 1;
            if (android.telephony.PhoneNumberUtils.isNonSeparator(cCharAt)) {
                if (chValueOf != null) {
                    strC = c(chValueOf.charValue(), z);
                    z = false;
                }
                chValueOf = java.lang.Character.valueOf(cCharAt);
            }
            z |= !(i3 != selectionEnd);
            i2++;
            i3 = i4;
        }
        if (chValueOf != null) {
            strC = c(chValueOf.charValue(), z);
        }
        java.lang.String str = strC;
        if (str.length() > 0) {
            akfi akfiVarB = b();
            if (akfiVarB.c) {
                int i5 = 0;
                int i6 = 0;
                while (i6 < akfiVarB.e && i5 < akfiVarB.a.length()) {
                    if (akfiVarB.b.charAt(i6) == akfiVarB.a.charAt(i5)) {
                        i6++;
                    }
                    i5++;
                }
                i = i5;
            } else {
                i = akfiVarB.d;
            }
            android.text.Editable editable3 = editable;
            editable3.replace(0, editable.length(), str, 0, str.length());
            boolean zContentEquals = str.contentEquals(editable3);
            editable2 = editable3;
            if (zContentEquals) {
                android.text.Selection.setSelection(editable3, i);
                editable2 = editable3;
            }
        } else {
            editable2 = editable;
        }
        mni.b(editable2);
        atomicBoolean.set(false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "s");
        d(charSequence, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "s");
        d(charSequence, i, i3);
    }
}
