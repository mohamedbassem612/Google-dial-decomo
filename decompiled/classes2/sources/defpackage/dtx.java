package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dtx {
    float a;
    float b;
    float c;
    float d;
    int e;
    defpackage.due f;

    public dtx(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), dui.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.e = typedArrayObtainStyledAttributes.getResourceId(0, this.e);
                java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                context.getResources().getResourceName(this.e);
                if ("layout".equals(resourceTypeName)) {
                    defpackage.due dueVar = new defpackage.due();
                    this.f = dueVar;
                    dueVar.d(context, this.e);
                }
            } else if (index == 1) {
                this.d = typedArrayObtainStyledAttributes.getDimension(1, this.d);
            } else if (index == 2) {
                this.b = typedArrayObtainStyledAttributes.getDimension(2, this.b);
            } else if (index == 3) {
                this.c = typedArrayObtainStyledAttributes.getDimension(3, this.c);
            } else if (index == 4) {
                this.a = typedArrayObtainStyledAttributes.getDimension(4, this.a);
            } else {
                android.util.Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
