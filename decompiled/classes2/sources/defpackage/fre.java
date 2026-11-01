package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fre implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = defpackage.ess.a;
        defpackage.esr esrVar = new defpackage.esr();
        java.lang.CharSequence charSequence = bundle.getCharSequence(defpackage.ess.a);
        if (charSequence != null) {
            esrVar.d(charSequence);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(defpackage.ess.b);
            if (parcelableArrayList != null) {
                android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    android.os.Bundle bundle2 = (android.os.Bundle) parcelableArrayList.get(i);
                    int i2 = bundle2.getInt(defpackage.esu.a);
                    int i3 = bundle2.getInt(defpackage.esu.b);
                    int i4 = bundle2.getInt(defpackage.esu.c);
                    int i5 = bundle2.getInt(defpackage.esu.d, -1);
                    android.os.Bundle bundle3 = bundle2.getBundle(defpackage.esu.e);
                    if (i5 == 1) {
                        ahvr.ci(bundle3);
                        java.lang.String string = bundle3.getString(defpackage.esw.a);
                        ahvr.ci(string);
                        spannableStringValueOf.setSpan(new defpackage.esw(string, bundle3.getInt(defpackage.esw.b)), i2, i3, i4);
                    } else if (i5 == 2) {
                        ahvr.ci(bundle3);
                        spannableStringValueOf.setSpan(new defpackage.esx(bundle3.getInt(defpackage.esx.a), bundle3.getInt(defpackage.esx.b), bundle3.getInt(defpackage.esx.c)), i2, i3, i4);
                    } else if (i5 == 3) {
                        spannableStringValueOf.setSpan(new defpackage.esv(), i2, i3, i4);
                    } else if (i5 == 4) {
                        ahvr.ci(bundle3);
                        java.lang.String string2 = bundle3.getString(defpackage.esy.a);
                        ahvr.ci(string2);
                        spannableStringValueOf.setSpan(new defpackage.esy(string2), i2, i3, i4);
                    }
                }
                esrVar.d(spannableStringValueOf);
            }
        }
        android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) bundle.getSerializable(defpackage.ess.c);
        if (alignment != null) {
            esrVar.b = alignment;
        }
        android.text.Layout.Alignment alignment2 = (android.text.Layout.Alignment) bundle.getSerializable(defpackage.ess.d);
        if (alignment2 != null) {
            esrVar.c = alignment2;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(defpackage.ess.e);
        if (bitmap != null) {
            esrVar.b(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(defpackage.ess.f);
            if (byteArray != null) {
                esrVar.b(android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        java.lang.String str2 = defpackage.ess.g;
        if (bundle.containsKey(str2)) {
            java.lang.String str3 = defpackage.ess.h;
            if (bundle.containsKey(str3)) {
                esrVar.c(bundle.getFloat(str2), bundle.getInt(str3));
            }
        }
        java.lang.String str4 = defpackage.ess.i;
        if (bundle.containsKey(str4)) {
            esrVar.d = bundle.getInt(str4);
        }
        java.lang.String str5 = defpackage.ess.j;
        if (bundle.containsKey(str5)) {
            esrVar.e = bundle.getFloat(str5);
        }
        java.lang.String str6 = defpackage.ess.k;
        if (bundle.containsKey(str6)) {
            esrVar.f = bundle.getInt(str6);
        }
        java.lang.String str7 = defpackage.ess.m;
        if (bundle.containsKey(str7)) {
            java.lang.String str8 = defpackage.ess.l;
            if (bundle.containsKey(str8)) {
                esrVar.e(bundle.getFloat(str7), bundle.getInt(str8));
            }
        }
        java.lang.String str9 = defpackage.ess.n;
        if (bundle.containsKey(str9)) {
            esrVar.g = bundle.getFloat(str9);
        }
        java.lang.String str10 = defpackage.ess.o;
        if (bundle.containsKey(str10)) {
            esrVar.h = bundle.getFloat(str10);
        }
        java.lang.String str11 = defpackage.ess.p;
        if (bundle.containsKey(str11)) {
            esrVar.f(bundle.getInt(str11));
        }
        if (!bundle.getBoolean(defpackage.ess.q, false)) {
            esrVar.i = false;
        }
        java.lang.String str12 = defpackage.ess.r;
        if (bundle.containsKey(str12)) {
            esrVar.j = bundle.getInt(str12);
        }
        java.lang.String str13 = defpackage.ess.s;
        if (bundle.containsKey(str13)) {
            esrVar.k = bundle.getFloat(str13);
        }
        java.lang.String str14 = defpackage.ess.t;
        if (bundle.containsKey(str14)) {
            esrVar.l = bundle.getInt(str14);
        }
        return esrVar.a();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
