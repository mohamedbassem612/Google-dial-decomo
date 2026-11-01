package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mku implements android.text.TextWatcher {
    private static final java.util.regex.Pattern b;
    public final defpackage.mkz a;
    private final defpackage.mla c;
    private boolean d;
    private java.lang.String e;

    static {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(new aorg("\\s+").b("\n          0?(\n            (\n            11|\n            2(\n              2(\n                02?|\n                [13]|\n                2[13-79]|\n                4[1-6]|\n                5[2457]|\n                6[124-8]|\n                7[1-4]|\n                8[13-6]|\n                9[1267]\n              )|\n              3(\n                02?|\n                1[467]|\n                2[03-6]|\n                3[13-8]|\n                [49][2-6]|\n                5[2-8]|\n                [67]\n              )|\n              4(\n                7[3-578]|\n                9\n              )|\n              6(\n                [0136]|\n                2[24-6]|\n                4[6-8]?|\n                5[15-8]\n              )|\n              80|\n              9(\n                0[1-3]|\n                [19]|\n                2\\d|\n                3[1-6]|\n                4[02568]?|\n                5[2-4]|\n                6[2-46]|\n                72?|\n                8[23]?\n              )\n            )|\n            3(\n              3(\n                2[79]|\n                6|\n                8[2578]\n              )|\n              4(\n                0[0-24-9]|\n                [12]|\n                3[5-8]?|\n                4[24-7]|\n                5[4-68]?|\n                6[02-9]|\n                7[126]|\n                8[2379]?|\n                9[1-36-8]\n              )|\n              5(\n                1|\n                2[1245]|\n                3[237]?|\n                4[1-46-9]|\n                6[2-4]|\n                7[1-6]|\n                8[2-5]?\n              )|\n              6[24]|\n              7(\n                [069]|\n                1[1568]|\n                2[15]|\n                3[145]|\n                4[13]|\n                5[14-8]|\n                7[2-57]|\n                8[126]\n              )|\n              8(\n                [01]|\n                2[15-7]|\n                3[2578]?|\n                4[13-6]|\n                5[4-8]?|\n                6[1-357-9]|\n                7[36-8]?|\n                8[5-8]?|\n                9[124]\n              )\n            )\n          )?15\n          ).*\n        ", ""));
        aooh.e(patternCompile, "compile(...)");
        b = patternCompile;
    }

    public mku(defpackage.mla mlaVar, defpackage.mkz mkzVar, aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.c = mlaVar;
        this.a = mkzVar;
        this.e = "";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) throws java.io.IOException {
        aooh.f(editable, "s");
        aooh.f(editable, "s");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = editable.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = editable.charAt(i);
            if (android.telephony.PhoneNumberUtils.isNonSeparator(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        java.lang.String string = sb.toString();
        if (!b.matcher(string).matches()) {
            this.a.afterTextChanged(editable);
            java.lang.String string2 = editable.toString();
            if (this.e.equals(string2)) {
                return;
            }
            this.e = string2;
            mni.b(editable);
            this.c.y().b(editable.toString());
            return;
        }
        if (string.contentEquals(editable)) {
            mni.b(editable);
            this.c.y().b(editable.toString());
        } else {
            editable.replace(0, editable.length(), string);
            android.text.Selection.setSelection(editable, editable.length());
            android.telephony.PhoneNumberUtils.addTtsSpan(editable, 0, editable.length());
            this.c.y().b(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "s");
        this.a.beforeTextChanged(charSequence, i, i2, i3);
        this.d = android.text.TextUtils.isEmpty(charSequence);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "input");
        this.a.onTextChanged(charSequence, i, i2, i3);
        if (this.d != android.text.TextUtils.isEmpty(charSequence)) {
            defpackage.mla mlaVar = this.c;
            mlaVar.H().invalidateOptionsMenu();
            mlaVar.y().j(this.d);
        }
    }
}
