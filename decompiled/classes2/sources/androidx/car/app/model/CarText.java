package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarText {
    private final java.util.List mSpans;
    private final java.util.List mSpansForVariants;
    private final java.lang.String mText;
    private final java.util.List mTextVariants;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public final class Builder {
        java.lang.CharSequence mText;
        java.util.List mTextVariants = new java.util.ArrayList();

        public Builder(java.lang.CharSequence charSequence) {
            this.mText = (java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence);
        }

        public androidx.car.app.model.CarText.Builder addVariant(java.lang.CharSequence charSequence) {
            this.mTextVariants.add((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence));
            return this;
        }

        public androidx.car.app.model.CarText build() {
            return new androidx.car.app.model.CarText(this);
        }
    }

    public CarText(androidx.car.app.model.CarText.Builder builder) {
        this.mText = builder.mText.toString();
        this.mSpans = getSpans(builder.mText);
        java.util.List list = builder.mTextVariants;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(i);
            arrayList.add(charSequence.toString());
            arrayList2.add(getSpans(charSequence));
        }
        this.mTextVariants = defpackage.rv.d(arrayList);
        this.mSpansForVariants = defpackage.rv.d(arrayList2);
    }

    public static androidx.car.app.model.CarText create(java.lang.CharSequence charSequence) {
        return new androidx.car.app.model.CarText((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence));
    }

    private static java.lang.CharSequence getCharSequence(java.lang.String str, java.util.List list) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        for (androidx.car.app.model.CarText.SpanWrapper spanWrapper : defpackage.rv.c(list)) {
            spannableString.setSpan(spanWrapper.getCarSpan(), spanWrapper.getStart(), spanWrapper.getEnd(), spanWrapper.getFlags());
        }
        return spannableString;
    }

    private static java.util.List getSpans(java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            for (java.lang.Object obj : spanned.getSpans(0, charSequence.length(), java.lang.Object.class)) {
                if (obj instanceof androidx.car.app.model.CarSpan) {
                    arrayList.add(new androidx.car.app.model.CarText.SpanWrapper(spanned, (androidx.car.app.model.CarSpan) obj));
                }
            }
        }
        return defpackage.rv.d(arrayList);
    }

    public static boolean isNullOrEmpty(androidx.car.app.model.CarText carText) {
        return carText == null || carText.isEmpty();
    }

    public static java.lang.String toShortString(androidx.car.app.model.CarText carText) {
        if (carText == null) {
            return null;
        }
        java.lang.String string = carText.toString();
        if (string.length() <= 16) {
            return string;
        }
        return string.substring(0, 8) + '~' + string.substring(string.length() - 8);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarText) {
            androidx.car.app.model.CarText carText = (androidx.car.app.model.CarText) obj;
            if (j$.util.Objects.equals(this.mText, carText.mText) && j$.util.Objects.equals(this.mSpans, carText.mSpans) && j$.util.Objects.equals(this.mTextVariants, carText.mTextVariants) && j$.util.Objects.equals(this.mSpansForVariants, carText.mSpansForVariants)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getSpansForVariants() {
        return this.mSpansForVariants;
    }

    public java.util.List getVariants() {
        if (this.mTextVariants.isEmpty()) {
            return java.util.Collections.EMPTY_LIST;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mTextVariants.size(); i++) {
            arrayList.add(getCharSequence((java.lang.String) this.mTextVariants.get(i), (java.util.List) this.mSpansForVariants.get(i)));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mText, this.mSpans, this.mTextVariants, this.mSpansForVariants});
    }

    public boolean isEmpty() {
        return this.mText.isEmpty();
    }

    public java.lang.CharSequence toCharSequence() {
        return getCharSequence(this.mText, this.mSpans);
    }

    public java.lang.String toString() {
        return this.mText;
    }

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class SpanWrapper {
        private final androidx.car.app.model.CarSpan mCarSpan;
        private final int mEnd;
        private final int mFlags;
        private final int mStart;

        public SpanWrapper(android.text.Spanned spanned, androidx.car.app.model.CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.car.app.model.CarText.SpanWrapper) {
                androidx.car.app.model.CarText.SpanWrapper spanWrapper = (androidx.car.app.model.CarText.SpanWrapper) obj;
                if (this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && j$.util.Objects.equals(this.mCarSpan, spanWrapper.mCarSpan)) {
                    return true;
                }
            }
            return false;
        }

        public androidx.car.app.model.CarSpan getCarSpan() {
            return this.mCarSpan;
        }

        public int getEnd() {
            return this.mEnd;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public int getStart() {
            return this.mStart;
        }

        public int hashCode() {
            return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.mStart), java.lang.Integer.valueOf(this.mEnd), java.lang.Integer.valueOf(this.mFlags), this.mCarSpan});
        }

        public java.lang.String toString() {
            return "[" + this.mCarSpan + ": " + this.mStart + ", " + this.mEnd + ", flags: " + this.mFlags + ']';
        }

        SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new androidx.car.app.model.CarSpan();
        }
    }

    public java.util.List getSpans() {
        return this.mSpans;
    }

    private CarText() {
        this.mText = "";
        this.mSpans = java.util.Collections.EMPTY_LIST;
        this.mTextVariants = java.util.Collections.EMPTY_LIST;
        this.mSpansForVariants = java.util.Collections.EMPTY_LIST;
    }

    public CarText(java.lang.CharSequence charSequence) {
        this.mText = charSequence.toString();
        this.mSpans = getSpans(charSequence);
        this.mTextVariants = java.util.Collections.EMPTY_LIST;
        this.mSpansForVariants = java.util.Collections.EMPTY_LIST;
    }
}
