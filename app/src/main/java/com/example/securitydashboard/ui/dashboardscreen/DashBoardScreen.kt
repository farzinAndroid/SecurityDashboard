package com.example.securitydashboard.ui.dashboardscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.securitydashboard.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecurityDashboardScreen() {

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .padding(bottom = 60.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id = R.color.cultured))
                ) {
                    Column {
                        UserSection(
                            name = "Farzin Allahyari",
                            designation = "Android developer",
                            image = R.drawable.user
                        )
                        SearchSection()
                        StatisticSection()
                        CompanyGoals()
                    }
                }

            }
        },
        bottomBar = {
            BottomBarSection()
        }
    )


}


@Composable
fun CompanyGoals() {

    val gradientBackground = Brush.verticalGradient(
        colors = listOf(
            colorResource(id = R.color.maximum_blue_green), colorResource(id = R.color.flax)
        )
    )



    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "Company goals",
                color = colorResource(id = R.color.black),
                fontSize = 26.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "All", color = colorResource(id = R.color.black), fontSize = 14.sp
            )
        }

        Box(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(top = 8.dp, bottom = 24.dp)
                .border(1.dp, color = colorResource(id = R.color.black))
                .fillMaxWidth()
                .weight(1f)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .background(gradientBackground)
                        .fillMaxHeight()
                        .width(12.dp)
                        .border(1.dp, color = colorResource(id = R.color.black))
                )
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_check_circle_24),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                        Text(
                            text = "Cyber security teams",
                            color = colorResource(id = R.color.black),
                            fontSize = 16.sp,
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 4.dp)
                        )
                        Text(
                            text = "Active",
                            color = colorResource(id = R.color.gray),
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                    Text(
                        text = "Conduct pishing simulations\nwithin company",
                        color = colorResource(id = R.color.black),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 18.dp)
                    )
                    Divider(
                        color = colorResource(id = R.color.gray),
                        thickness = 1.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 18.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_check_circle_24),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(colorResource(id = R.color.gray)),
                            modifier = Modifier.size(20.dp)

                        )
                        Text(
                            text = "Ends in 24 days",
                            color = colorResource(id = R.color.gray),
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                }
            }
        }
//        BottomTabsSection(
//            tabs = listOf(
//                R.drawable.round_dashboard_24,
//                R.drawable.round_pie_chart_24,
//                R.drawable.round_calendar_month_24,
//                R.drawable.round_account_circle_24
//            )
//        )
    }
}


@Composable
fun StatisticRow(
    image: Int,
    title: String,
    statisticsNumber: Int = 0,
    price: Int = 0,
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {  },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(colorResource(id = R.color.black)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = "",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(colorResource(R.color.cultured))
            )
        }

        Text(
            text = title,
            fontSize = 20.sp,
            color = colorResource(id = R.color.black),
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(0.7f)
        )

        if (statisticsNumber != 0) {
            Row(
                modifier = Modifier.weight(0.3f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    painter = if (statisticsNumber > 0) painterResource(R.drawable.baseline_arrow_upward_24) else painterResource(
                        R.drawable.baseline_arrow_downward_24
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(36.dp)
                        .padding(8.dp),
                    tint = if (statisticsNumber > 0) Color.Green else Color.Red
                )

                Text(
                    text = "$statisticsNumber %",
                    fontSize = 20.sp,
                    color = if (statisticsNumber > 0) Color.Green else Color.Red,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        } else {

            Row(
                modifier = Modifier.weight(0.3f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "$ $price",
                    fontSize = 20.sp,
                    color = colorResource(R.color.black),
                    fontWeight = FontWeight.SemiBold,
                )
            }

        }


    }

}

@Composable
fun StatisticSection() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = "Statistics",
            color = colorResource(id = R.color.black),
            fontWeight = FontWeight.SemiBold,
            fontSize = 26.sp
        )

        Text(
            text = "MONTH",
            color = colorResource(id = R.color.black),
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )

    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {

        StatisticRow(
            image = R.drawable.round_vpn_key_24, title = "Security attacks", statisticsNumber = 68
        )

        Spacer(modifier = Modifier.height(20.dp))

        StatisticRow(
            image = R.drawable.baseline_fingerprint_24,
            title = "Protected bunches",
            statisticsNumber = -38
        )

        Spacer(modifier = Modifier.height(20.dp))

        StatisticRow(
            image = R.drawable.baseline_language_24, title = "Runtime cost", price = 6235
        )

    }

}

@Composable
fun SearchSection() {

    var textFieldState by remember {
        mutableStateOf("")
    }

    val gradientBackground = Brush.verticalGradient(
        colors = listOf(
            colorResource(id = R.color.maximum_blue_green), colorResource(id = R.color.flax)
        )
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .background(colorResource(R.color.cultured))
            .border(1.dp, colorResource(id = R.color.black)),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.baseline_search_24),
            contentDescription = null,
            colorFilter = ColorFilter.tint(colorResource(id = R.color.gray)),
            modifier = Modifier
                .size(48.dp)
                .padding(12.dp)
        )

        BasicTextField(
            value = textFieldState,
            onValueChange = { textFieldState = it },
            textStyle = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.black)
            ),
            singleLine = true,
            decorationBox = { decoration ->
                decoration()

                if (textFieldState.isEmpty()) {
                    Text(
                        text = "Search",
                        color = colorResource(id = R.color.gray),
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp
                    )
                }

            },
            modifier = Modifier
                .background(Color.Transparent)
                .padding(start = 4.dp, end = 16.dp)
                .weight(1f),

            )


        Image(
            painter = painterResource(id = R.drawable.round_filter_list_24),
            contentDescription = null,
            colorFilter = ColorFilter.tint(colorResource(id = R.color.black)),
            modifier = Modifier
                .size(48.dp)
                .background(gradientBackground)
                .border(1.dp, color = colorResource(id = R.color.black))
                .padding(12.dp)
                .clickable {  }
        )
    }

}


@Composable
fun UserSection(
    name: String,
    designation: String,
    image: Int,
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 28.dp)
            .padding(top = 28.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier.weight(1f),
        ) {

            Text(
                text = name,
                color = colorResource(R.color.black),
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp
            )

            Text(
                text = designation, color = colorResource(R.color.gray), fontSize = 18.sp
            )


        }

        Image(
            painter = painterResource(image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .border(1.dp, colorResource(R.color.black))
        )

    }

}