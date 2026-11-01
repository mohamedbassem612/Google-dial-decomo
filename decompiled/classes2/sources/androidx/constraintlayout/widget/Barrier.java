package androidx.constraintlayout.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class Barrier extends dtt {
    public int a;
    public dsv b;

    public Barrier(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    protected final void a(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dui.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    ((dtt) this).f = typedArrayObtainStyledAttributes.getString(35);
                    e(((dtt) this).f);
                } else if (index == 36) {
                    ((dtt) this).g = typedArrayObtainStyledAttributes.getString(36);
                    f(((dtt) this).g);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.b = new dsv();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, dui.b);
            int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = typedArrayObtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    this.a = typedArrayObtainStyledAttributes2.getInt(26, 0);
                } else if (index2 == 25) {
                    this.b.b = typedArrayObtainStyledAttributes2.getBoolean(25, true);
                } else if (index2 == 27) {
                    this.b.c = typedArrayObtainStyledAttributes2.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.i = this.b;
        h();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    public final void b(dsy dsyVar, boolean z) {
        int i = this.a;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (dsyVar instanceof dsv) {
            ((dsv) dsyVar).a = i;
        }
    }

    public final void c(int i) {
        this.b.c = i;
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
